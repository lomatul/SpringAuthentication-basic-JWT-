//package com.example.Basic_Auth.SecurityConfig;
//
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
//
//public class SpringSecurityConfig extends WebSecurityConfiguration {
//
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception
//    {
//        auth.inMemoryAuthentication().withUser("Lomatul").password("123456").roles("USER").and().withUser("admin").password("admin12345").roles("USER","ADMIN");
//    }
//
//    protected void  configure(HttpSecurity http) throws Exception
//    {
//        http.httpBasic().and().authorizeRequests().antMatchers("/userlogin").hasRole("USER")
//                .antMatchers("/adminlogin").hasRole("ADMIN").and().csrf().disable().headers()
//                .frameOptions().disable();
//    }
//}