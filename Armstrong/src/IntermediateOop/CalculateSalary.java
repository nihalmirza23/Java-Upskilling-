package IntermediateOop;



public class CalculateSalary{
	
	public static void main(String[] args) {
		
		Employee e=new Manager();
		System.out.println(e.calculateTotalSalary(50));
		
		Employee d=new Labour();
		System.out.println(d.calculateTotalSalary(50));
		
	}
}






class Employee {

public int calculateTotalSalary(int days) {
	
	return days;
}	
}

class  Manager extends Employee{
	int incentives=30000;
	
	@Override
	public int calculateTotalSalary(int days) {
		// TODO Auto-generated method stub
		return (days*500)+incentives;
	}
}

class Labour extends Employee{
	
	int overtime=300;
	
	@Override
	public int calculateTotalSalary(int days) {
		// TODO Auto-generated method stub
		return (days*300)+overtime;
	}
}
