package csan.springframework.controllers;

import csan.springframework.Services.GreetingService;

public class ConstructorInjectedController {

	private GreetingService greetingService;
	
	public ConstructorInjectedController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
}
