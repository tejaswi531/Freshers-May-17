package collections;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;



public class Firstletter {

	public static void main(String[] args) {
		String[] strArray = { "Red", "green", "Blue", "Yellow", "Violet", "Magenta", "Purple" }; 
        System.out.println(Arrays.stream(strArray) 
                .filter(Objects::nonNull) 
                .map(s->s.charAt(0)) 
                .collect(Collectors.toList())); 
    } 

	

}
