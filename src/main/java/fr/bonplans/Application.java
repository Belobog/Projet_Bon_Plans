package fr.bonplans;

import javax.activation.DataSource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring3.SpringTemplateEngine;
import org.thymeleaf.spring3.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {
    
    @Bean
    ServletContextTemplateResolver templateResolver() {
        ServletContextTemplateResolver resolver = new ServletContextTemplateResolver();
        resolver.setSuffix(".jsp");
        resolver.setTemplateMode("HTML5");
        return resolver;
    }
    
    @Bean
    SpringTemplateEngine engine() {
        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.setTemplateResolver(templateResolver());
        return engine;
    }
    
    @Bean
    ThymeleafViewResolver viewResolver() {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(engine());
        return viewResolver;
    }
    
    
    //Objectif virer cette merde et la remplacer par un fichier xml
    /*
    
    <bean id="dataSource"
    		class="org.springframework.jdbc.datasource.DriverManagerDataSource">
     
    		<property name="driverClassName" value="com.mysql.jdbc.Driver" />
    		<property name="url" value="jdbc:mysql://localhost:3306/mkyongjava" />
    		<property name="username" value="root" />
    		<property name="password" value="password" />
    	</bean>
    
    */
    
    
    
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
        //Uti
    }
    
    
    public void run(){
    	
    }
    
}
