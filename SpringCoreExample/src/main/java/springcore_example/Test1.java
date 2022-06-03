package springcore_example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test1 {
	
	public static void main(String[] args) {  
	    Resource r=new ClassPathResource("beans.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    Customer c=(Customer)factory.getBean("obj");  
	    c.displayInfo();  
	      
	}  

}
