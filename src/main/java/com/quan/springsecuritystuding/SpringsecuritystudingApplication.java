package com.quan.springsecuritystuding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@MapperScan("com.quan.springsecuritystuding.mapper")
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class SpringsecuritystudingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringsecuritystudingApplication.class, args);
    }

}
