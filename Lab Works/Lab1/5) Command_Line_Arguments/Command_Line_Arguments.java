class Command_Line_Arguments {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		int sum = a + b;
		int difference = a - b;

		System.out.println("Sum : " + a + " + " + b + " = " + sum + "\n");
		System.out.println("Difference : " + a + " - " + b + " = " + difference + "\n");
	}
}