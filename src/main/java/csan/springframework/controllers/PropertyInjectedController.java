package csan.springframework.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import csan.springframework.Services.GreetingServiceImpl;


@Controller
public class PropertyInjectedController {
	@Autowired
	
	public GreetingServiceImpl greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting()+" by property";
	}

}
