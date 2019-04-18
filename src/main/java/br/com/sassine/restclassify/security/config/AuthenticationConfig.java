package br.com.sassine.restclassify.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import br.com.sassine.restclassify.security.DefaultAuthentication;
import br.com.sassine.restclassify.security.filter.AuthenticationFilter;

@Configuration
@EnableWebSecurity
public class AuthenticationConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		
		httpSecurity.csrf()
		.disable()
		.authorizeRequests()
		.antMatchers("/","/static/**","favicon.ico","/tes","/v2/api-docs", "/configuration/**", "/swagger*/**", "/webjars/**").permitAll()
		.antMatchers(HttpMethod.POST, "/login").permitAll()
		.anyRequest().authenticated().and()
		.addFilterBefore(new DefaultAuthentication("/login", authenticationManager()),UsernamePasswordAuthenticationFilter.class)
		.addFilterBefore(new AuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
	}
	
	

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("admin").password("{noop}sassine").roles("ADMIN");
	}
}