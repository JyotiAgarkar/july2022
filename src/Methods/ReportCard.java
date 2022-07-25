package Methods;

public class ReportCard 
{

	int std_id;
	String name;
	int eng_mark;
	int math_mark;
	int sci_mark;
	
	
	public ReportCard()
	{
		std_id=1;
		 name="Jyoti";
		 eng_mark=30;
		 math_mark=78;
		 sci_mark=56;
	}
	public void checkpass() 
	{
		if(eng_mark<35||math_mark<35||sci_mark<35)
			System.out.println("FAIL");
		
	
			//System.out.println("PASS");
	}
	public static int total(int a,int b,int c)
	
	{
		int total;
		total=a+b+c;
		return total;
	}
	
	public static void main(String []args)
	{
		int marks;
		ReportCard rd=new ReportCard();
		rd.checkpass();//nonstatic method inner class
		marks=total(rd.eng_mark,rd.math_mark,rd.sci_mark) ;//static method inner class
	System.out.println(marks);	
	FinalReport.printReport(rd.std_id, rd.name, marks);//static method outer class
	}
	
}
