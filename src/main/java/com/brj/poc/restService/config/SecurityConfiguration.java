package com.brj.poc.restService.config;

/*
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.spi.LocationAwareLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
*/

//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration /*extends WebSecurityConfigurerAdapter*/ {

   // private static Logger logger = LoggerFactory.getLogger(SecurityConfiguration.class);


    //@Override
    //protected void configure(HttpSecurity http) throws Exception {

        //http.httpBasic().disable();

        // allow swagger through security
        //http.authorizeRequests().antMatchers("/", "/actuator/**","/v3/api-docs/**", "/swagger-ui/**", "/swagger-ui.html").permitAll();

        // allow actuator for health check
        //http.authorizeRequests().requestMatchers().("health").permitAll();

        // probably a fallback

        //http.authorizeRequests().requestMatchers(EndpointRequest.toAnyEndpoint()).authenticated()

       // http
       // .authorizeRequests()
       // .antMatchers("/swagger-ui*/**", "/javainuse-openapi/**","/actuator/**").permitAll()
      //  .anyRequest().authenticated()
      //  .and()
        //.httpBasic();
    //}

    /*@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user1").password(passwordEncoder().encode("user1"))
                .authorities("ROLE_USER");
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }*/
}
