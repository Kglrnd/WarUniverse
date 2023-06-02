package de.kugidev.games.wu.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService() {
		return null;
        // Implementierung von UserDetailsService
    	
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public Customizer<HttpSecurity> securityCustomizer() {
        return (http) -> {
			try {
				http
				    .authorizeHttpRequests(authorizeRequests ->
				        authorizeRequests				        
				            .requestMatchers("/api/**").hasAnyRole("ADMIN", "USER")
				            .anyRequest().permitAll()
				    )
				    .formLogin(Customizer.withDefaults())
		            .httpBasic(Customizer.withDefaults());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
    }
}