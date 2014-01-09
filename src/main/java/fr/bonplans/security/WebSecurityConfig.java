package fr.bonplans.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import fr.bonplans.dao.interfaces.UtilisateurDAO;




@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


	private DataSource dataSource ;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		System.out.println("configure");
		http
		.authorizeRequests()
		.antMatchers("/","/Accueil","/Inscription","/resources/**").permitAll().anyRequest().authenticated();
		http
		.formLogin()
		.defaultSuccessUrl("/ConnexionOk",true)
		.loginPage("/Connexion")
		.usernameParameter("security_username")
		.passwordParameter("security_password")
		.permitAll()
		.and()
		.logout()
		.permitAll();
		
		http
		.logout()
		.logoutSuccessUrl("/Connexion")
		.logoutUrl("/Deconnexion")
		.permitAll();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder authManagerBuilder) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource.xml");
		dataSource = (DataSource) context.getBean("dataSource");


		authManagerBuilder.jdbcAuthentication()
		.dataSource(dataSource)
		.usersByUsernameQuery("SELECT email AS Username ,password as password, active as enabled FROM utilisateur WHERE email = ?")
		.authoritiesByUsernameQuery("SELECT email AS Username,role as authority FROM utilisateur WHERE email =?");
		System.out.println("configure2");
		//authManagerBuilder.inMemoryAuthentication().withUser("email").password("password").roles("USER");
	}
}