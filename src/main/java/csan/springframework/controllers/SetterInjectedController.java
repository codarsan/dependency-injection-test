package csan.springframework.controllers;

import csan.springframework.Services.GreetingService;

public class SetterInjectedController {
	
	private GreetingService greetingService;
	
	String sayHello () {
		return greetingService.sayGreeting();
	}

	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

}
