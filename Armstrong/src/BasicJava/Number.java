package BasicJava;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a input Number :");
		
		int number= sc.nextInt();  
		int temp=number;
		
		int remainder=0;
		int result=0;
		
		while(temp != 0) {
			
			int tempRem = temp %10;
			result = result + (tempRem*tempRem*tempRem);
			temp=temp/10;
			
		}
		
		if(number == result) {
			System.out.println("Number is amstrong");
		}
		else {
			System.out.println("Number is Not Amstrong ");
		}
		
		
		
		
		
	}
	
}
