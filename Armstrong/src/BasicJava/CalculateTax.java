package BasicJava;

import java.util.Scanner;

public class CalculateTax {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		int ctc = sc.nextInt();
		
		
		if(ctc <= 180000) {
			
			System.out.println("Tax payable in per :Nil");
			
		}
		else if(ctc <= 300000) {
			
			System.out.println("Tax payable in percentage :"+ctc*0.1);
		}
		else if(ctc <= 500000) {
			
			System.out.println("Tax payable in percentage :"+ctc*0.2);
	}
		else if(ctc <= 1000000) {
			
			System.out.println("Tax payable in percentage :"+ctc*0.3);
	}
		
		
	}
}
