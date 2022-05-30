import java.util.Scanner;

public class Arm {

	public static void main(String[] args) {
		int num;
		int sum;
		int i=1;
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		num=sc.nextInt();
		sum=0;
		i=num;
		while(num>0)
		{
			n=num%10;
			num=num/10;
			sum=sum+(n*n*n);
		}		
		if(sum==i)
			System.out.print(i+"is an armstrong:");
		else
			System.out.print(i+"is not an armstrong:");
	}
}	
			
		

	


