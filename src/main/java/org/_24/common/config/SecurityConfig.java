package org._24.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable())  // Disable CSRF protection
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))  // No sessions
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/api/auth/**").permitAll()      // Allow all auth endpoints
                        .requestMatchers("/api/articles/**").permitAll()  // Allow all article endpoints
                        .requestMatchers("/api/courses/**").permitAll()   // Allow all course endpoints
                        .anyRequest().authenticated()
                )
                .httpBasic(basic -> basic.disable());  // Disable basic auth

        return http.build();
    }
}