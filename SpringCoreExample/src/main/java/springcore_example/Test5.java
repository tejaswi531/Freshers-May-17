package springcore_example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test5 {
	public static void main(String[] args) {
	      
	    		  
		  Resource r=new ClassPathResource("beans3.xml");
		  BeanFactory factory=new XmlBeanFactory(r);
	      
	      Hello obj = (Hello)factory.getBean("helloWorld");
	      obj.getMessage();

    }
}
