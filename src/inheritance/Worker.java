package inheritance;

public class Worker {
	String sname;
	int sage;
	int smob_no;
	String saddress;
	int salary;

//	Worker()
//	{}
//	

	Worker(String s, int a, int m, String add, int sal) {
		sname = s;
		sage = a;
		smob_no = m;
		saddress = add;
		salary = sal;

	}

	void displySalary() {
		System.out.println("salary is" + salary);
	}
	void printData()
	{
		System.out.println("name is"+sname);
		System.out.println("age  is"+sage);
		System.out.println("smob_no is"+smob_no);
		System.out.println("address is"+saddress);
	}

//	public class Employee extends Worker
//	{
//	String work_specilize;
//	String dept;
//	}
//	
//	
//
//	public class Manager
//	{
//		String work_specilize;
//		String dept;
//
//		}
//	

}
