package br.com.cmabreu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@ComponentScan( basePackages="br.com.cmabreu.*")
public class WebConfig implements WebMvcConfigurer {


	  @Override
	  public void configureViewResolvers(ViewResolverRegistry registry) {
		  registry.jsp("/WEB-INF/", ".jsp");
	  }

	  @Override
	  public void addResourceHandlers(ResourceHandlerRegistry registry) {
		  //
	  }	  
	  
	  @Override
	  public void addViewControllers(ViewControllerRegistry registry) {
		  registry.addViewController("loginPage");
		  registry.addViewController("index");

	  }	
	
	  

	
}
