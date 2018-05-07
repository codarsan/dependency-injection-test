package csan.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import csan.springframework.controllers.ConstructorInjectedController;
import csan.springframework.controllers.HelloController;
import csan.springframework.controllers.PropertyInjectedController;
import csan.springframework.controllers.SetterInjectedController;
import csan.springframework.examplebeans.DataSource;

@SpringBootApplication
public class DependencyInjectionTestApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionTestApplication.class, args);
		//HelloController controller = (HelloController) ctx.getBean("helloController");
		//System.out.println(contr.Hello());
		//System.out.println(ctx.getBean(HelloController.class).Hello());
		//System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		//System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		//System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
		DataSource dataSource = (DataSource) ctx.getBean(DataSource.class);
		System.out.println(dataSource.getUsername());
	}
}
