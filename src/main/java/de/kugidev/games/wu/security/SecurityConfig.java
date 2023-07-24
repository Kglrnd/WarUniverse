package de.kugidev.games.wu.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import de.kugidev.games.wu.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class SecurityConfig  {
	
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
				    .httpBasic(Customizer.withDefaults())
				    .logout(logout -> logout.logoutUrl("/logout"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        };
    }
   
    
    private boolean isUser(Authentication authentication) {
		return authentication.isAuthenticated();
	}

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
        final List<GlobalAuthenticationConfigurerAdapter> configurers = new ArrayList<>();
        configurers.add(new GlobalAuthenticationConfigurerAdapter() {
                    @Override
                    public void configure(AuthenticationManagerBuilder auth) throws Exception {
                       auth
                       .build();
                    }
                }
        );
        return authConfig.getAuthenticationManager();
    }
    
    @Bean
    public UserDetailsService userDetailsService() {
        return new UserDetailsServiceImpl();
    }
    
    

}
