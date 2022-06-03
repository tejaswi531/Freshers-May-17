package springcore_example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("details.xml");
		
		Employee emp = ac.getBean("myemployee",Employee.class);
		System.out.println(emp.toString());

	}

}
