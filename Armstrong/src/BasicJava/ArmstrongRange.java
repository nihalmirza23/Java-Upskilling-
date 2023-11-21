package BasicJava;



public class ArmstrongRange {
	
	public static void main(String[] args) {
		
		for(int i=100;i < 1000;i++) {
		
			int number= i; 
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
}
