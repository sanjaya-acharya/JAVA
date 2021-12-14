abstract class Vehicle {
	int speed = 0;
	public abstract void horn();

	public void park(){
		speed = 0;
		System.out.println("Parked!\n");
	}

	public void accelerate(){
		speed++;
		System.out.println("Accelerated!\n");
	}
}

class Car extends Vehicle {
	public void horn() {
		System.out.println("Pop Pop!\n");
	}
}

class Abstract_Class {
	public static void main (String args[]) {
		Car volvo = new Car();

		volvo.horn(); // overroded abstract method
		volvo.accelerate(); // Data hiding acheived
		volvo.park();
	}
}