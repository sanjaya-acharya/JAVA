interface Parent_A {
	int a = 5; // this is a final variable although we didn't write the final keyword
	void hello(); // this is a abstract method although we didn't write the abstract keyword
}

interface Parent_B {
	void hello();
}

class Child implements Parent_A, Parent_B {
	public void hello() {
		System.out.println("Multiple Inheritance acheived!\n");
	}
}

class Multiple_Inheritance {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.hello();
	}
}