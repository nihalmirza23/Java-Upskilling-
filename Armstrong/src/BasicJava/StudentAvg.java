package BasicJava;

import java.util.Scanner;

public class StudentAvg {

	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); 
		
		
		//Enter the first subject marks
		System.out.println("Enter first subject marks:");
		int first = sc.nextInt();
		
		//Enter the first subject marks
		System.out.println("Enter secound subject marks:");
		int secound = sc.nextInt();
		
		//Enter the third subject marks
		System.out.println("Enter third subject marks:");
		int third = sc.nextInt();
		
		if( first>60 && secound > 60 && third > 60 ) {
			System.out.println("Student is passed");
		}
		
		else if((first>60 && secound>60) || (secound>60 && third>60) || (third>60 && first>60)) {
			
			System.out.println("Student is promoted");
		}
		
		else {
			System.out.println("Student is fail");
		}
		
	}
}
