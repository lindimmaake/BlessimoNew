package com.example.BlessimoOnline.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

@EnableWebMvc
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.example.BlessimoOnline.model"})
@EnableJpaRepositories(basePackages = {"com.example.BlessimoOnline.repo"})
@ComponentScan(basePackages = {"com.example.BlessimoOnline"})
@EnableTransactionManagement
public class WebConfig extends WebMvcConfigurerAdapter {
	
	@Bean
	public TemplateResolver templateResolver(){
		ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver();
		templateResolver.setPrefix("/templates/view");
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode("HTML5");
		return templateResolver;
	}
	
	@Bean
	public SpringTemplateEngine templateEngine()
	{
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.setTemplateResolver(templateResolver());
		return templateEngine;
	}
	
	   @Bean
	    public ViewResolver getViewResolver() {
	        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
	        resolver.setTemplateEngine(templateEngine());
	        resolver.setOrder(1);
	        return resolver;
	    }
	
 
	}