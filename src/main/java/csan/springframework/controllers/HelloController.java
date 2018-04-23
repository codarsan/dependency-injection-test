package csan.springframework.controllers;

import org.springframework.stereotype.Controller;
import csan.springframework.Services.GreetingService;

@Controller
public class HelloController {
	private GreetingService greetingService;
	
	public HelloController(GreetingService greetingService) {
		this.greetingService = greetingService;
	}

	public String Hello () {
		System.out.println("Hello");
		return greetingService.sayGreeting();
	}

}
