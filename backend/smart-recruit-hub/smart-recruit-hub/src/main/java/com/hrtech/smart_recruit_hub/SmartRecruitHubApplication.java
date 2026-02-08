package com.hrtech.smart_recruit_hub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = { org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class })
public class SmartRecruitHubApplication {
    public static void main(String[] args) {
        SpringApplication.run(SmartRecruitHubApplication.class, args);
    }
}
