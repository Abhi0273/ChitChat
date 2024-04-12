package com.chitchat.security;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.servlet.util.matcher.MvcRequestMatcher;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;


@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class WebSecurityConfig {
	
//	private final EntryPointUnauthorizedHandler unauthorizedHandler;
//    private final AuthenticationConfiguration authConfig;
//    private final AuthenticationTokenFilter authenticationTokenFilter;
	
	@Autowired
    private JwtAuthenticationEntryPoint point;
    @Autowired
    private JwtAuthenticationFilter filter;
    
    List<String> publicApis = List.of("/ChitChat/v1/user/hello", "/ChitChat/v1/auth/login");
    
    @Bean
    public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception {
        return http.getSharedObject(AuthenticationManagerBuilder.class)
                .build();
    }

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	//requestMatchers("/Coachify/customer/**").authenticated()
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http,HandlerMappingIntrospector introspector) throws Exception {
		
		MvcRequestMatcher.Builder mvcRequestMatcher= new MvcRequestMatcher.Builder(introspector).servletPath("/Chitchat/v1");
		http.csrf(AbstractHttpConfigurer::disable).authorizeHttpRequests(auth -> {
			auth.requestMatchers("/auth/login","/user/register").permitAll()
//			.requestMatchers("/ChitChat/v1/user/hello").authenticated();
			.anyRequest().authenticated();
		}).exceptionHandling(ex -> ex.authenticationEntryPoint(point))
		.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
		http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
	}
}