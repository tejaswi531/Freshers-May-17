package springcore_example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test6 {
	public static void main(String[] args) {
		Resource r=new ClassPathResource("beans4.xml");
		  BeanFactory factory=new XmlBeanFactory(r);
	      World obj = (World)factory.getBean("helloWorld");
	      obj.getMessage();
	      
	   }

}
