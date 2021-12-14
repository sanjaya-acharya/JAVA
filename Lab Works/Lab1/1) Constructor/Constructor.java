class Person {
	String name;
	int age;
	
	Person () {
		System.out.println("-----------------------------\n");
		System.out.println("Default Constructor called...\n");
		System.out.println("-----------------------------\n\n\n");
	}

	Person (String name, int age) {
		this.name = name;
		this.age = age;

		System.out.println("-----------------------------\n");
		System.out.println("Name = " + name + "\nAge = " + age);
		System.out.println("\nParameterized Constructor called...\n");
		System.out.println("-----------------------------\n\n\n");
	}

	Person (Person P) {
		name = P.name;
		age = P.age;

		System.out.println("-----------------------------\n");
		System.out.println("Data of one object copied into another object...\n");
		System.out.println("Name = " + name + "\nAge = " + age);
		System.out.println("\n-----------------------------\n\n\n");
	}
}

class Constructor {
	public static void main (String args[]) {
		// Since the class Person contains 2 constructors, Java compiler will not add a default constructor.
		Person p1 = new Person (); // Non-parameterized or no argument constructor.
		Person p2 = new Person ("Sanjaya Acharya", 21); // Parameterized constructor.
		Person p3 = new Person (p2); // An alternative to the copy constructors
	}
}