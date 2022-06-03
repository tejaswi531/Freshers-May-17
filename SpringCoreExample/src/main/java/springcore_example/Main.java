package springcore_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	private static ApplicationContext context;
	
	public static void main(String[]args) {
		context = new ClassPathXmlApplicationContext("beams.xml");
		
		HelloBeam hellobeam = (HelloBeam) context.getBean("HelloBeam");
		
		hellobeam.sayHello();
	}

}
