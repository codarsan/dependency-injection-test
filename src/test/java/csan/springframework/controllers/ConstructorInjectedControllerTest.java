package csan.springframework.controllers;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import csan.springframework.Services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {
	
	private ConstructorInjectedController constructorInjectedController;

	@Before
	public void setUp() throws Exception {
		this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO_STR, constructorInjectedController.sayHello());
	}

}
