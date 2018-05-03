package csan.springframework.Services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository{

	@Override
	public String GetEnglishGreeting() {
		return "Hello by primary";
	}

	@Override
	public String GetSpanishGreeting() {
		return "Hola de primario";
	}

	@Override
	public String GetGermanGreeting() {
		return "Hallo von primär";
	}
	

}
