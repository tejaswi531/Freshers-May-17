package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class Odd {
	interface Stringlength{
		int getLength(String str);

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>(Arrays.asList("rashmi","Satish","Naveen","sai","deepika"));





		names.removeIf((String str)-> str.length()%2 == 1 );





		System.out.println(names);

	}
	}

}
