package com.quan.springsecuritystuding.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author 86156
 */
//@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        String psw = bCryptPasswordEncoder.encode("123");
        auth.inMemoryAuthentication().withUser("wz").password(psw).roles("admin");
    }

    /**
     * 不重写加密会报错
     *
     * @return
     */
    @Bean
    PasswordEncoder password() {
        return new BCryptPasswordEncoder();
    }
}
