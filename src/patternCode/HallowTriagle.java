package patternCode;

public class HallowTriagle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) { //loop for rows
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i || i == 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}

			System.out.println();
		}

	}

}
