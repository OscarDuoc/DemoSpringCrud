package com.acl.configuracion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class SecurityConfig {
	
	
	//Encriptar Contraseñas - Oscar Poblete 31-01-2022
	@Bean
	public BCryptPasswordEncoder bcryptPasswordEncoder() {
		BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
		return bcryptPasswordEncoder;
	}
	
	//Configuracion de Peticiones - Oscar Poblete 01-02-2022
	//Autenticacion
	@Override
	protected void configure(AuthenticationManagerBuilder auth)
	throws Exception {
		auth.userDetailsService().passwordEncoder(passwordEncoder());
	}
	
	//Configuracion de Peticiones - Oscar Poblete 31-01-2022
	//Autorización
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
		.authorizeRequests()
		.antMatchers("/api/persona/")
		.permitAll()
		.antMatchers().hasAnyRole("Admin")
		.anyRequest().authenticated()
		.and()
		.httpBasic();
		http.csrf().disable();
	}
	
}
