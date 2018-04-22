package csan.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import csan.springframework.controllers.ConstructorInjectedController;
import csan.springframework.controllers.HelloController;
import csan.springframework.controllers.PropertyInjectedController;
import csan.springframework.controllers.SetterInjectedController;

@SpringBootApplication
public class DependencyInjectionTestApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionTestApplication.class, args);
		HelloController contr = (HelloController) ctx.getBean("helloController");
		contr.Hello();
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
