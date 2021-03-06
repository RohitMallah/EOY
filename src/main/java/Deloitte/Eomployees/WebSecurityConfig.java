package Deloitte.Eomployees;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	  private UserDetailsService userDetailsSerice;
	  
	 @Bean
	    public BCryptPasswordEncoder bCryptPasswordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
	  
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
        		.authorizeRequests().antMatchers("/","/signup","/h2").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin().loginPage("/signin").permitAll()
                .and()
                .logout().permitAll();
        http.csrf().disable();
        http.headers().frameOptions().disable();
        http.formLogin().defaultSuccessUrl("/dashboard.html", true);
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("admin").password("password").roles("USER")
                .and().withUser("user").password("password").roles("USER");
        
       auth.userDetailsService(userDetailsSerice).passwordEncoder(bCryptPasswordEncoder());
    }
    
   }
