package br.com.cmabreu.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses () {
    	System.out.println("AppInitializer :: getRootConfigClasses");
        return null;
    }
    
    @Override
    protected Class<?>[] getServletConfigClasses () {
    	System.out.println("AppInitializer :: getServletConfigClasses");
        return new Class<?>[]{ WebConfig.class };
    }
    
    @Override
    protected String[] getServletMappings () {
    	System.out.println("AppInitializer :: getServletMappings");
        return new String[]{"/"};
    }	
	


    
}
