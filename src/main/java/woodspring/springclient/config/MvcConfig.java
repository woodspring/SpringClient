package woodspring.springclient.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
	   registry.addResourceHandler("/resources/**")
	           .addResourceLocations("classpath:/static/");
	 }  
}