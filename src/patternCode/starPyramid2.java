//          *
//         ***
//        *****
//       *******
//      *********
//     ***********
//    *************
//   ***************
package patternCode;

public class starPyramid2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
         int num=1;
		for(int i=1;i<=10;i++)
		{
			for(int j=10;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=num;k++)
			{
				
				System.out.print("*");
			}
			num+=2;
			System.out.println();
		}
	}

}
