/**
 * 
 */
package com.chandak.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author krishna
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.chandak.springmvc" })
public class ApplicationMvcConfiguration extends WebMvcConfigurerAdapter {

	/** CONSTANTS **/
	private static final String VIEW_RESOLVER_PREFIX = "/WEB-INF/contents/";
	private static final String VIEW_RESOLVER_SUFFIX = ".jsp";

	private static final String RESOURCES_LOCATION = "/resources/";
	private static final String RESOURCES_PATTERN = "/resources/**";

	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix(VIEW_RESOLVER_PREFIX);
		viewResolver.setSuffix(VIEW_RESOLVER_SUFFIX);
		return viewResolver;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler(RESOURCES_PATTERN).addResourceLocations(RESOURCES_LOCATION);
	}

}
