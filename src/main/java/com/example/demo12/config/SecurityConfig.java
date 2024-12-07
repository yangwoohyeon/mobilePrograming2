package com.example.demo12.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .csrf().disable() // CSRF 비활성화
                .authorizeRequests()
                .antMatchers("/test1").permitAll()
                .antMatchers("/test3").hasRole("ADMIN")
                .antMatchers("/param0").permitAll()
                .anyRequest().permitAll();

        http
                .formLogin();

        http
                .logout().logoutUrl("/logout");

    }
}
