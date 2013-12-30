package fr.bonplans.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		System.out.println("configure");
		http
		.authorizeRequests()
		.antMatchers("/home").permitAll()
		.anyRequest().authenticated();
		http
		.formLogin()
		.defaultSuccessUrl("/hello")
		.loginPage("/login")
		.permitAll()
		.and()
		.logout()
		.permitAll();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder authManagerBuilder) throws Exception {
		System.out.println("configure2");
		authManagerBuilder.inMemoryAuthentication()
		.withUser("user").password("password").roles("USER");
	}
}