package csan.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import csan.springframework.controllers.HelloController;

@SpringBootApplication
public class DependencyInjectionTestApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionTestApplication.class, args);
		HelloController contr = (HelloController) ctx.getBean("helloController");
		contr.Hello();
	}
}
