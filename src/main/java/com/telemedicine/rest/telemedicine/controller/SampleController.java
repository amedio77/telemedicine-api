package com.telemedicine.rest.telemedicine.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SampleController {

    // inject via application.properties
    @Value("${welcome.message:test}")
    private String message = "Hello World";

    @GetMapping("/")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {

        System.out.println("SampleController hello !!!! ");
        model.addAttribute("name", name);
        return "index.html";
    }
}