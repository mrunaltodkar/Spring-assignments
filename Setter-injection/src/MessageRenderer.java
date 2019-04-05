package com.capgemini.spring.renderer;

import com.capgemini.spring.provider.MessageProvider;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class MessageRenderer{

	private MessageProvider provider;	
	
	@Autowired
	@Qualifier("abc")
	public void setMessageProvider(MessageProvider provider){
		this.provider = provider;
	}

	public void render(){
		System.out.println(provider.getMessage());
	}
}