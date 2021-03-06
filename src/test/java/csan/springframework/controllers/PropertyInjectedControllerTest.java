package csan.springframework.controllers;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import csan.springframework.Services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {
	private PropertyInjectedController propertyInjectedController;

	@Before
	public void setUp() throws Exception {
		this.propertyInjectedController = new PropertyInjectedController();
		this.propertyInjectedController.greetingService = new GreetingServiceImpl();
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO_STR, propertyInjectedController.sayHello());
	}

}
