package collections;

import java.util.ArrayList;
import java.util.Arrays;



public class Sixth_1 {

	public static void main(String[] args) throws CloneNotSupported {
		ArrayList<String> alphabets = new ArrayList<>(Arrays.asList("deepika", "manoj", "teja", "aruna", "sweety"));
		
		
		   
		   System.out.println(alphabets);

		   alphabets.replaceAll(e ->e.toUpperCase() );

		   System.out.println(alphabets);
		   }

}


