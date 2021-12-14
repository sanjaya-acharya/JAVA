class Myclass {
	static int obj_count = 0; 

	Myclass () {
		obj_count++;
	}

	static void object_counter() {
		System.out.println("Number of objects created = " + obj_count + "\n");
	}
}

class Static_Method_And_Variables {
	public static void main(String[] args) {
		Myclass.object_counter(); // Calling static method through class name

		Myclass obj1 = new Myclass();
		Myclass obj2 = new Myclass();
		Myclass obj3 = new Myclass();

		obj1.object_counter(); // Calling static method through object

	}
}