package com.sparta.halls.app.configuration;

import com.sparta.halls.app.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .antMatchers("/**", "/welcome").permitAll()
                .antMatchers("/signedin").hasAnyRole("USER", "ADMIN")
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/welcome", false).failureUrl("/login?error").permitAll()
                .permitAll()
                .and()
                .logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout")).logoutSuccessUrl("/login?logout").permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        // resident, nomResident, admin
        auth.inMemoryAuthentication()
                .withUser("user@sparta.ac.uk").password("{noop}u").roles(Roles.STUDENT)
                .and()
                .withUser("admin@sparta.ac.uk").password("{noop}a").roles(Roles.ADMIN)
                .and()
                .withUser("third@sparta.ac.uk").password("{noop}t").roles(Roles.PUBLIC);
    }
}
