package java11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



public class CountWordFile {

	public static void main(String[] args) throws Exception {
		File file = new File("c:\\Users\\TPOTNURU\\Desktop\\Students data.txt");
		String st;
		//int count=0;
		
		//opens a file in read mode
		
		//FileReader file = new FileReader("Students data.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		//String st;
		
		//Gets each line till end of file is reached
		
		while((st=br.readLine())!=null) 
			//split each line into words
			//String words[]=st.split("");
			//counts each word
			//count=count+words.length;
		
		
		//System.out.println(+count);
		//br.close();
		System.out.println(st);
		

	}

}
