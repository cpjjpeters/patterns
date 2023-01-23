package com.coffeepoweredcrew.factorymethod;

import com.coffeepoweredcrew.factorymethod.message.Message;
import com.coffeepoweredcrew.factorymethod.message.TextMessage;

public class Client {

	public static void main(String[] args) {

	Message tMessage = new TextMessageCreator().createMessage();
	Message jsonMessage = new JSONMessageCreator().createMessage();
		tMessage.addDefaultHeaders();
		System.out.println(tMessage.getContent());

		jsonMessage.addDefaultHeaders();
		System.out.println(jsonMessage.getContent());
		System.out.println("--------------------------");

		printMessage(new JSONMessageCreator());

		printMessage(new TextMessageCreator());
	}

	public static void printMessage(MessageCreator creator) {
		Message msg = creator.getMessage();
		System.out.println(msg);
	}
}
