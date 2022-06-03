package springcore_example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@ComponentScan
@PropertySource("classpath:dbconfig.properties")
public class Service {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context=new AnnotationConfigApp){
				Configurationfile data=context.getBean(Configurationfile.class);
				         System.out.println(data.Url());
				         System.out.println(data.driverclassname());
				
				         System.out.println(data.username);
				         System.out.println(data.password);
				
		

	}

}
}
