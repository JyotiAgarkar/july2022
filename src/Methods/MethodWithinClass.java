package Methods;

import patternCode.Multiplication;

public class MethodWithinClass {
	
	static void addition()
	{
		int a=10,b=20;
		int c;
		c=a+b;
		System.out.println("Addition a method from same class");
		System.out.println("Addition is " +c);
	}
	
	public static void main(String []args)
	{
	
		addition();
		Subtraction.subtraction();
		Multiplication.multiplication();
	}
	

}
