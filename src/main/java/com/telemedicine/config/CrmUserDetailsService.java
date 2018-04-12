package com.telemedicine.config;

import com.telemedicine.member.entity.MemberInfo;
import com.telemedicine.member.repository.MemberInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


@Service
public class CrmUserDetailsService implements UserDetailsService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MemberInfoRepository memberInfoRepository;

    @Bean
    public BCryptPasswordEncoder encoder(){
        return new BCryptPasswordEncoder();
    }


    @Override
    public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
       List<MemberInfo> userList = memberInfoRepository.findByUserId(userId);
        if(userList == null || userList.size() == 0){
            throw new UsernameNotFoundException("userId "+userId+" not found");
        }

        MemberInfo memberInfoResult = null;

        for (MemberInfo memberInfo : userList) {
            //logger.debug("loadUserByUsername="+memberInfo.getPass());
            memberInfoResult = memberInfo;
        };

        String password = encoder().encode(memberInfoResult.getPass());
        memberInfoResult.setPass(password);

        return new CrmUserDetails(memberInfoResult);
    }

}
