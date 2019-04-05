package com.capgemini.spring.provider;

import org.springframework.stereotype.Component;

@Component("abc")
public class HwMessageProvider implements MessageProvider{
	
	@Override
	public String getMessage(){
		return "Hello World!!!";
	}

}