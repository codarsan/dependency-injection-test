package csan.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import csan.springframework.Services.GreetingRepository;
import csan.springframework.Services.GreetingService;
import csan.springframework.Services.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig {
	
	@Bean
	GreetingServiceFactory greetingServiceFactory(GreetingRepository repository) {
		return new GreetingServiceFactory(repository);
	}

	@Bean
	@Primary
	@Profile({"default","en"})
	GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
		return greetingServiceFactory.CreateGreetingService("en");
	}
}
