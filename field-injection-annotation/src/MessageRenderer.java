package com.capgemini.spring.renderer;

import com.capgemini.spring.provider.MessageProvider;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class MessageRenderer{

	@Autowired
	private MessageProvider provider;

	public void render(){
		System.out.println(provider.getMessage());
	}
}