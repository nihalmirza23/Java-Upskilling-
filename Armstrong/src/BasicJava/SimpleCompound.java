package BasicJava;

import java.util.Scanner;

public class SimpleCompound {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double simpleintrest = 0;
		
		double compoundintrest=0;
		
		//sum amount
		System.out.println("Enter Sum amount: ");
		int sum = sc.nextInt();
		
		//rate of intrest
		System.out.println("Enter Intrest rate: ");
		double rate=sc.nextDouble();
		
		//Time period
		System.out.println("Enter Time period: ");
		int time=sc.nextInt();
		
		simpleintrest=(sum*rate*time)/100;
		
		System.out.println("simple intrest ="+simpleintrest);
		
		compoundintrest=sum*(Math.pow((1+rate/100), time)-1 );
		
		System.out.println("compound intrest="+compoundintrest);
		
		
		
		
	}
}
