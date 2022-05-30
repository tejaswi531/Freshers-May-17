import java.util.Scanner;

public class Markstotal {

	public static void main(String[] args) {
		
			int A[]=new int[3];
			int B[]=new int[3];
			int C[]=new int[3];
			double Total[]=new double[4];
			double A1_Total=0,B1_Total=0,C1_Total=0;
	       double Avg[]=new double[4];
			double A1_Avg=0,B1_Avg=0,C1_Avg=0;
			Scanner Sc=new Scanner(System.in);
			for(int i=0;i<3;i++)
			{
				System.out.println("Student"+ i+1);
				System.out.println("enter marks in subject A");
				A[i]=Sc.nextInt();
				System.out.println("enter marks in subject B");
				B[i]=Sc.nextInt();
				System.out.println("enter marks in subject C");
				C[i]=Sc.nextInt();
				Total[i]=A[i]+B[i]+C[i];
				Avg[i]=A[i]+B[i]+C[i]/3;
				A1_Total+=A[i];
				B1_Total+=B[i];
				C1_Total+=C[i];
			
				A1_Avg+=A[i];
				B1_Avg+=B[i];
				C1_Avg+=C[i];
			}
			for(int i=0;i<3;i++)
			{
				System.out.println("Total marks of name" +i+" is "+Total[i]);
				System.out.println("Average marks of name" +i+" is "+Avg[i]);
			}
			
			System.out.println("Total marks in A" +A1_Total);
			System.out.println("Total marks in B" +B1_Total);
			System.out.println("Total marks in C" +C1_Total);
				
			System.out.println("Average marks in A" +A1_Avg/3);
			System.out.println("Average marks in B" +B1_Avg/3);
			System.out.println("Average marks in C" +C1_Avg/3);
				
				
				
	}

}

		