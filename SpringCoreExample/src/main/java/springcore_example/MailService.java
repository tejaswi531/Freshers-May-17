package springcore_example;
import java.util.HashMap;
import java.util.Map;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;


import org.springframework.context.annotation.ComponentScan;



@ComponentScan
public class MailService {

	   private Map<String, String> map=null;
	   
	   public MailService() {
	      map=new HashMap<String, String>();
	   }

	   public void send(String mailTo){
	      //Code for sending mail
	      System.out.println("Inside send method - "+mailTo);
	   }
	  
	   @interface PostConstruct{
		   
	   }
	   
	   
	   @PostConstruct
	   public void init() throws Exception {
	      map.put("host", "mail.example.com");
	      map.put("port", "25");
	      map.put("from", "example@boraji.com");
	      System.out.println("Inside init method - "+map);
	   }
	   
	   @interface PreDestroy{
		   
	   }
	   
	   @PreDestroy
	   public void destroy() throws Exception {
	      map.clear();
	      System.out.println("Inside destroy method - "+map);
	   }
	}


