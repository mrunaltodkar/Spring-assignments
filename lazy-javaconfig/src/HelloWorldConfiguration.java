package com.capgemini.spring.configuration;

import com.capgemini.spring.renderer.*;
import com.capgemini.spring.provider.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
public class HelloWorldConfiguration{
	@Bean
	public MessageProvider provider() {
		return new HwMessageProvider();
	}
 
	@Bean
	public MessageRenderer renderer(){
		return new MessageRenderer(provider());
 	}
}