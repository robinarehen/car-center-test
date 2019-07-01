package com.asesoftware.carcentertest.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		StringBuilder userQuery = new StringBuilder();
		
		userQuery.append("select username, password, enabled from USUARIOS ");
		userQuery.append("where username = ?");
		
		StringBuilder authorityQuery = new StringBuilder();
		
		authorityQuery.append("select usu.username, rol.nombre from roles rol ");
		authorityQuery.append("inner join roles_usuarios rolusu on (rolusu.id_rol = rol.id_rol) ");
		authorityQuery.append("inner join usuarios usu on (usu.id_usuario = rolusu.id_usuario) ");
		authorityQuery.append("where usu.username = ?");
		
		auth.jdbcAuthentication()
			.dataSource(dataSource)
			.usersByUsernameQuery(userQuery.toString())
			.authoritiesByUsernameQuery(authorityQuery.toString())
			.passwordEncoder(passwordEncoder())
			.rolePrefix("ROLE_");
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		// TODO Auto-generated method stub
		return new BCryptPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		String[] urlPermitAll = new String[] {
				"/",
				"/index",
				"/login",
				"/cliente/crear",
				"/js/**"
		};
		
		http.authorizeRequests()
			.antMatchers(urlPermitAll).permitAll()
			.anyRequest().authenticated()
			.and()
			.formLogin().loginPage("/login").defaultSuccessUrl("/dashboard", true).permitAll();
	}

	
}
