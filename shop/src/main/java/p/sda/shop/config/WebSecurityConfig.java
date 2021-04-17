package p.sda.shop.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    
    @Autowired
    DataSource dataSource;


    @Override
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {
        // dodatkowa praca dowowa stworzyc wlasne talebe i podać springowi zapytania do tych tabel
        auth.jdbcAuthentication().dataSource(dataSource);
    }

    //ćwiczenie 1
/*    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("marian").password("{noop}marian12345").authorities("USER").and()
                .withUser("admin").password("{noop}admin").authorities("USER", "ADMIN").and()
                .withUser("mariola").password("{noop}1qaz@WSX").authorities("GUEST").and()
                .withUser("jaroslaw").password("{noop}donald123").authorities("USER").accountLocked(true);
    }*/
}
