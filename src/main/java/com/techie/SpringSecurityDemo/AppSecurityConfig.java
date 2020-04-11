package com.techie.SpringSecurityDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class AppSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	@Bean
	protected UserDetailsService userDetailsService() {

		List<UserDetails> userDetails = new ArrayList<UserDetails>();

		userDetails.add(User.withDefaultPasswordEncoder().username("Srikanth").password("1234").roles("ROLE").build());

		return new InMemoryUserDetailsManager(userDetails);

	}

}
