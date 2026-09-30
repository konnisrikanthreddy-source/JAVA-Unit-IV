package utilpackage;
import java.util.Scanner;

public class ScannerClass {
	public static void main(String args[])
	{
		
		
		String names[]=new String[2];
							
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter a string into an array");
		names[0]=sc.next();
		System.out.println("Enter 2nd string into an array");
		names[1]=sc.next();
		System.out.println(names[0]+"\n"+names[1]);*/
			
		for(int i=0;i<names.length;i++)
		{
			System.out.println("Enter Student "+(i+1)+" Name");
			names[i]=sc.next();
		}
		
		for(int i=0;i<names.length;i++)
		{
			System.out.println("Enter Student "+(i+1)+" is "+names[i]);	
		}
		
		/*System.out.println("Enter another Student Name");
		names[2]=sc.next();*/
	}
}
