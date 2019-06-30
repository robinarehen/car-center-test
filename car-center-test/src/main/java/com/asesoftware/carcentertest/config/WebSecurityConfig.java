package com.asesoftware.carcentertest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		String[] urlPermitAll = new String[] {
				"/",
				"/index",
				"/login",
				"/cliente/crear"
		};
		
		http.authorizeRequests()
			.antMatchers(urlPermitAll).permitAll()
			.anyRequest().authenticated()
			.and()
			.formLogin().loginPage("/login").defaultSuccessUrl("/dashboard", true).permitAll();
	}

	
}
