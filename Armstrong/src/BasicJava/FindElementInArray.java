package BasicJava;

import java.util.Scanner;

public class FindElementInArray {
	public static void main(String[] args) {
		

		int[] arr = { 5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47 };
		
			Scanner sc= new Scanner(System.in); 
		
			System.out.println("Enter the number which you want to find :");
			int num=sc.nextInt();
			
			for(int i=0;i<arr.length;i++) {
				
				if(arr[i]==num) {
					System.out.println("Value exist in array");
					break;
				}
				else if(i==arr.length-1) {
					System.out.println("Value not exist in array");
				}
				
			}
		
		
		
	}

		
		
}
