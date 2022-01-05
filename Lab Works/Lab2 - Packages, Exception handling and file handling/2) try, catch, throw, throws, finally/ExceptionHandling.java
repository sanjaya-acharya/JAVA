class TryCatchFinally {
	public static String test () {
		try {
			System.out.println(5/0); // Divide by zero..
		}
		catch (ArithmeticException e) {
			return e.getMessage(); // When exception occurs, a value is returned to the function and function gets terminated 
		}
		finally { // even after retrun statement gets executed, the contents of finally block is executed.
			System.out.println("\nTHIS GETS EXECUTED EVEN AFTER THE CATCH BLOCK RETURNS SOME VALUE TO THE FUNCTION\n\n");
		}

		return "Exception didn't occur";
	}

	public static void Throw_s() throws Exception { // throws commands JVM to handle the exception explicitly
		System.out.println("\nHello\n\n");
		throw new Exception("this is a user-defined exception"); // this throws exception object.
	}
}


class Exception_Handling {
	public static void main (String[] args) throws Exception {
		int x[] = new int[5];

		try {
			x[6] = 10; // trying to access invalid index of array
		}
		catch (ArrayIndexOutOfBoundsException e) { // This block executes only if exception occurs at try block
			System.out.println("\nError!\n'" + e.getMessage() + "'");
		}

		TryCatchFinally.test();
		// throw new Exception("Exc");
		TryCatchFinally.Throw_s();

		System.out.println("Hello");

	}
}