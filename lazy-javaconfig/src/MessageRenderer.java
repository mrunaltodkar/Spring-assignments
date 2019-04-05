package com.capgemini.spring.renderer;

import com.capgemini.spring.provider.MessageProvider;
import org.springframework.context.annotation.Lazy;

@Lazy
public class MessageRenderer{

	private MessageProvider provider;

	//Using ctor
	public MessageRenderer(MessageProvider provider){
		this.provider = provider;
	
	}	

	public void render(){
		System.out.println(provider.getMessage());
	}
}