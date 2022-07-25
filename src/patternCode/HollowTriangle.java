package patternCode;

public class HollowTriangle
{
	public static void main(String []args)
	{
		for(int i=1;i<=5;i++)
		{
			if(i==1||i==5)
				{
				
				for(int j=1;j<=i;j++)
					System.out.print("*");
				}
			System.out.println();
				
				for(int k=1;k<=i;k++)
			{
				System.out.print("*");	
				for(int l=1;l<=i;l++)
				{
				System.out.print(" ");
				}
				
			
			}
		}
			
	}
}

