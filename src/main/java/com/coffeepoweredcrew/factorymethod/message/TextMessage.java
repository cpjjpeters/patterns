package com.coffeepoweredcrew.factorymethod.message;

public class TextMessage extends Message {
	
	@Override
	public String getContent() {
		return "Text";
	}

	@Override
	public void addDefaultHeaders() {
		//Adds some default headers
		System.out.println("addDefaultHeaders for a TextMessage");
	}
	
}
