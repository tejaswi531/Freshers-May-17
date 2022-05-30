package myphnbook;

import java.io.*;
import java.util.*;
 
public class PhoneBook {
	public static String help_msg=	"Press: H  Help   -  A  Add contact  -  S  Search  - Q  Exit :";
	public static void main(String[] args) {		
		System.out.println("\n\n***** Welcome to MyPhone Book *****\n\n");
		Scanner s=new Scanner(System.in);		
		for(;;){
				System.out.print("[Main Menu] "+help_msg+"\n:");
				String command=s.nextLine().trim();				
 
				if (command.equalsIgnoreCase("H")){					
					System.out.println(help_msg);
				}else if (command.equalsIgnoreCase("A")){
					System.out.print("Type in contact details in the format: name,lastname,phone\n:");
					String line=s.nextLine().trim();
					String [] tmp=line.split(",");
					while(tmp.length!=3){
						System.out.print("Error, Try the format : name,lname,phone\n:");
						line=s.nextLine().trim();
						tmp=line.split(",");						
					}
					try{
						FileWriter fs = new FileWriter("phonebook.csv",true);
						BufferedWriter out = new BufferedWriter(fs);
						out.write(line+"\n");
						out.close();
					}catch(Exception e){e.printStackTrace();}
 
				}else if (command.equalsIgnoreCase("S")){
					System.out.print("Type in the name you are searching for :\n:");
 
				}else if (command.equalsIgnoreCase("Q")){
					System.out.println("Good Bye User....");
					System.exit(0);
				}else{					
					System.out.print("Unknown command ! Try again \n:");
				}
 
		}
 
	}
 
}