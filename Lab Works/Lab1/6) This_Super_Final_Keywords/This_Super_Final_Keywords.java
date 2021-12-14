class Class_A {
	public static final double PI = 3.14; // This is a final variable (constant)
	String message;

	Class_A (String message) {
		this.message = message; // Using this pointer to initialize the variable
	}
}

class Class_B extends Class_A {
	Class_B (String a)
	{
		super (a); // This calls the constructor of parent class
	}

	public void Display () {
		System.out.println(message);
	}
}


class This_Super_Final_Keywords {
	public static void main(String[] args) {
		Class_B object1 = new Class_B("Hello\n");
		object1.Display();

		Class_B object2 = new Class_B("Java\n");
		object2.Display();
	}
}