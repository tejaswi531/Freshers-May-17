package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.UnaryOperator;



public class Sixth_2 {

	public static void main(String[] args) {
		ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("deepika","manoj","teja","aruna","sweety"));
		System.out.println(alphabets);
		alphabets.replaceAll( new MyOperator() );
		System.out.println(alphabets);
		
	}
		

		

}
class MyOperator implements UnaryOperator<String>
{
	@Override
	public String apply(String t) {
		return t.toUpperCase();
	}
	
	






	

}
