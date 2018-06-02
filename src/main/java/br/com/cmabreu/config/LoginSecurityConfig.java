package br.com.cmabreu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class LoginSecurityConfig extends WebSecurityConfigurerAdapter {
	
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	//
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
		.csrf().disable()
		.authorizeRequests()
		.antMatchers("/login*").anonymous()
		
		.anyRequest().authenticated()
		.and()
          
		.formLogin()
		.loginPage("/loginPage")
		.defaultSuccessUrl("/home", true)
		.failureUrl("/loginPage?error=true")
		.loginProcessingUrl("/login")
		.usernameParameter("username")
		.passwordParameter("password")
		.and()
		
		.logout()
		.logoutSuccessUrl("/loginPage")
		.invalidateHttpSession(true); 
        
    }    
    
}

