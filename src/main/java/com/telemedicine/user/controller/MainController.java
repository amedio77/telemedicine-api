package com.telemedicine.user.controller;


import com.telemedicine.user.entity.UserInfo;
import com.telemedicine.user.repositoty.UserInfoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserInfoRepository customerRepository;

    @GetMapping("/")
    public String main(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "/test/index.html";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage() {
        System.out.println(" login action !!!");
        return "/login";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String userinfo(Principal principal, Map<String, UserInfo> model) {
        System.out.println(" userinfo action !!!"+principal.getName());

        List<UserInfo> userinfo = customerRepository.findByUserId(principal.getName());
        if( userinfo.size() > 0 ){
            model.put("userinfo", userinfo.get(0));
        }
        return "/user/userinfo.html";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testinfo() {
        System.out.println(" testinfo action !!!");
        return "/test/index.html";
    }

    @RequestMapping(value="/logout", method = RequestMethod.GET)
    public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/login?logout";
    }
}