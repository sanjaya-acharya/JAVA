import java.util.Scanner;

class InvalidAgeException extends Exception {
	String message = "Age must be in range 1 to 100";

	public String getMessage() {
		return message;
	}
}

class AgeException {
	public static void main(String[] args) throws InvalidAgeException {
		Scanner scan = new Scanner(System.in);

		System.out.println("\nEnter your Age");
		int age = scan.nextInt();
		scan.close();

		if (age < 1 || age > 100) {
			throw new InvalidAgeException();
		}
		else {
			System.out.println("You are " + age + " years old");
		}
	}
}