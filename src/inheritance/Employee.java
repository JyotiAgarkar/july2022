package inheritance;

public class Employee extends Worker {

	String work_specilize;
	String dept;

	Employee(String s, int a, int m, String add, int sal, String spe, String dpt) {
		super(s, a, m, add, sal);
		
		work_specilize = spe;
		dept = dpt;

	}
	
	void printdata()
	{
		System.out.println(" work_specilize is "+ work_specilize);
		System.out.println(" Department is "+ dept);
	}

	public static void main(String[] args) {

		Employee emp = new Employee("jyoti", 30, 9798, "mumbai", 40000, "Computer", "IT");

		emp.displySalary();
		emp.printData();
		emp.printdata();

	}
}
