interface Interface_A {
	void abstract_method();

	default void default_method() {
		System.out.println("This is default method\nIt contains definition inside the interface\n");
	}
}


class MyClass implements Interface_A {
	public void abstract_method() {
		System.out.println("This is abstract method\nIt contains definition inside the implemented class\n");
	}
}

class Default_Method {
	public static void main(String[] args) {
		MyClass obj1 = new MyClass();

		obj1.abstract_method();
		obj1.default_method();
	}
}