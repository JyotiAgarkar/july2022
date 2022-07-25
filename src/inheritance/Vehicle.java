package inheritance;

public class Vehicle {

    String veh_name;
	int model_no;
	float price;
	String station_name;
	
		
	Vehicle()
	{
		System.out.println("parent constructor");
		
	}
	Vehicle(String s,int m,float f,String sname)
	{
		veh_name=s;
		 model_no=m;
		 price=f;
		 station_name=sname;
		
	}
	
	
	void display()
	{
		System.out.println("Vehicle name="+veh_name);
		System.out.println("Model number="+model_no);
		System.out.println("Vehicle price="+price);
		System.out.println("Vehicle  Station name="+station_name);
	}
}
