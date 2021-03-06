package csan.springframework.Services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService{
	
	private GreetingRepository greetingRepository;
		
	public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
		this.greetingRepository = greetingRepository;
	}

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return greetingRepository.GetGermanGreeting();
	}
	
}
