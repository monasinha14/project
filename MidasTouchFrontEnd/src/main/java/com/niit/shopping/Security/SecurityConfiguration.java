package com.niit.shopping.Security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter  {
	@Autowired
	CustomSuccessHandler  customSuccessHandle;
	
	
	@Autowired
    DataSource dataSource;

         
    @Autowired
        public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception
        {
            
            auth.jdbcAuthentication().dataSource(dataSource)
            .usersByUsernameQuery("select uName , password, isActive from User where uName=?")
            .authoritiesByUsernameQuery("select uName,role from user where uName=?");
        }
    
	@Override
   protected void configure(HttpSecurity http) throws Exception{
		  http.authorizeRequests()
		.antMatchers("/**").access("permitAll()")
		.antMatchers("/user**").access("hasRole('USER')")
		.antMatchers("/admin**").access("hasRole('ADMIN')")
        .and().formLogin().loginPage("/login").successHandler(customSuccessHandle)
        .usernameParameter("username").passwordParameter("password")
        .and().csrf().disable();
   }
	
}
