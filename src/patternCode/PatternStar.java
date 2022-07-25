package patternCode;

public class PatternStar {
	
	public static void main(String []args)
	{
		//System.out.println("hi");
		for(int i=1;i<=4;i++)  // for row count
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=4;k++)
			{
				System.out.print("*");
			
			}
				
			System.out.println();
		}
	}

}
