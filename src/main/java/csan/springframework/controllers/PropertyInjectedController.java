package csan.springframework.controllers;

import csan.springframework.Services.GreetingServiceImpl;

public class PropertyInjectedController {
	
	public GreetingServiceImpl greetingService;
	
	String sayHello() {
		return greetingService.sayGreeting();
	}

}
