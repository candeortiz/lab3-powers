import java.util.Scanner;

public class Powers {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Learn your squares and cubes");
		boolean cont = true;
		while (cont) {
			System.out.println("Please enter your number: ");

			int number = getInt();
			System.out.println("Number\tSquared\tCube");
			for (int i = 1; i <= number; i++) {

				int squared = i * i;
				int cubed = i * i * i;
				System.out.println(i + "\t" + squared + "\t" + cubed);

			}
			System.out.println("continue?");
			String choice = scan.next();
			if (choice.equalsIgnoreCase("y") || choice.equalsIgnoreCase("yes")) {

			} else {
				cont = false;
				System.out.println("goodbye!");
			}
		}

	}

	public static int getInt() {
		while (!scan.hasNextInt()) {
			System.out.println("please enter a valid number: ");
			scan.next();
		}
		return scan.nextInt();
	}
}
