package com.verizon.springAngTest2.SecurityConfig;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
@org.springframework.context.annotation.Configuration
public class Configuration extends WebSecurityConfigurerAdapter {

	 /*@Override
	    protected void configure(AuthenticationManagerBuilder auth)
	      throws Exception {
	        auth
	          .inMemoryAuthentication()
	          .withUser("user")
	            .password("pass")
	            .roles("USER")
	            .and()
	          .withUser("admin")
	            .password("admin")
	            .roles("USER", "ADMIN");
	    }
	 
	   */ @Override
	    protected void configure(HttpSecurity http) throws Exception {
		   http.csrf().disable()
		      .authorizeRequests()
		      .anyRequest().authenticated()
		      .and()
		      .httpBasic()
		      .and()
		      .exceptionHandling();
		}
	    }
	/*@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		auth.inMemoryAuthentication()
        .withUser("user").password("pass").roles("USER");
        
	}

	/*@Override
	protected void configure(HttpSecurity http) throws Exception {
		// TODO Auto-generated method stub
		http.authorizeRequests().antMatchers("/").permitAll()
	      .and()
	      .authorizeRequests().antMatchers("/login").permitAll()
	      .and()
	      .authorizeRequests().antMatchers("/getall").hasAnyRole("USER","ADMIN")
	      .and()
	      .authorizeRequests().antMatchers("/create").hasAnyRole("ADMIN")
	      .and()
	      .authorizeRequests().antMatchers("/delete/{id}").hasAnyRole("ADMIN")
	      
	      .and()
	      .formLogin().successForwardUrl("/getall").failureUrl("/login?error=true")
	      .and()
	      .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
	
		/*http.authorizeRequests().antMatchers("/").permitAll()
	      .and()
	      .authorizeRequests().antMatchers("/login").permitAll()
	      .and()
	      .authorizeRequests().antMatchers("/getall").hasAnyRole("USER","ADMIN")
	      .and()
	      .authorizeRequests().antMatchers("/create").hasAnyRole("ADMIN")
	      .and()
	      .authorizeRequests().antMatchers("/delete/{id}").hasAnyRole("ADMIN")
	      .and()
	      .httpBasic();
	
	
	
	}
*/
	

