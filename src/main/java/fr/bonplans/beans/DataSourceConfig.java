package fr.bonplans.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import fr.bonplans.dao.JdbcUtilisateurDAO;



@Configuration
@ComponentScan
public class DataSourceConfig {
	
	@Bean
	DriverManagerDataSource dataSource(){
		DriverManagerDataSource dms = new DriverManagerDataSource();
		dms.setDriverClassName("com.mysql.jdbc.Driver");
		dms.setUrl("jdbc:mysql://localhost:3306/mkyongjava");
		dms.setUsername("root");
		dms.setPassword("mysql");
		return dms;
	}
	
	@Bean
	JdbcUtilisateurDAO getUtilisateur(){
		JdbcUtilisateurDAO jud = new JdbcUtilisateurDAO();
		jud.setDataSource(dataSource());
		return jud;
	}

}
