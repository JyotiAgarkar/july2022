package patternCode;

public class NumberPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) // i for row
		{

			for (int j = 5; j >= i; j--) // j for space
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) // k for printing 6number
			{
				if(k==i)
				{
					for (int l = k; l>=1 ; l--) //print decrement number
						System.out.print(l);
				}
				else System.out.print(k);
			}
			System.out.println();

		}

	}

}
