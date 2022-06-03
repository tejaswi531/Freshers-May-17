package springcore_example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test4 {
	 public static void main(String[] args)
		        throws Exception
		    {
		 
		        // Loading the Spring XML configuration
		        // file into the spring container and
		        // it will create the instance of
		        // the bean as it loads into container
		 
		  Resource r=new ClassPathResource("beans2.xml");
		  BeanFactory factory=new XmlBeanFactory(r);
		  
		        ConfigurableApplicationContext cap = null;
				// It will close the spring container
		        // and as a result invokes the
		        // destroy() method
		         cap.close();
		    }
		    
		

}
