import java.io.IOException;

class ChainedException {
	public static void main(String[] args) throws Exception {

		System.out.println("\nNotice the program log for chained exception\n-----");

		try {
			throw new ArithmeticException("Invalid Answer"); // This is exception occured
		}
		catch (Exception e) {
			throw new IOException("Input Error"); // This is the cause of that exception
		}
	}
}