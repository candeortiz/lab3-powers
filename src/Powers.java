import java.util.Scanner;

public class Powers {

	public static void main(String[] args) {
		System.out.println("Learn your squares and cubes");
		boolean cont = true;
		while (cont) {
			System.out.println("Please enter your number: ");
			Scanner scan = new Scanner(System.in);
			int number = scan.nextInt();
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
}
