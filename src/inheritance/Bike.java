package inheritance;

public class Bike extends Vehicle {
	
	float disc_rate;
	
	Bike(String s,int m,float f,String sname,float r)
	{
		
		super(s,m,f,sname);
		disc_rate=r;
	}
	
	void display(float dm)
	{
		super.display();
		System.out.println("discount amounte="+dm);
	}
 
	float discount(float f,float r)
	{
		float dis_amt;
		dis_amt=(r*f)/100;
		return dis_amt;
	}
	
	
	public static void main(String[] args) {
		float dis_amt;
		Bike b=new Bike("Honda",2345,3000,"Pune",20);
	    dis_amt =b.discount(b.price, b.disc_rate);
	     b.display(dis_amt);
		
	}
}

