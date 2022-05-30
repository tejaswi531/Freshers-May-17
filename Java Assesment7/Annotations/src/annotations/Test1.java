package annotations;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
@Retention(RUNTIME)
@Target(METHOD)
@interface Tes{
	
}

public class Test1 {
	public void display() {
		System.out.println("Tes display( )");
		
	}
	

	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.display();
		

	}

}
