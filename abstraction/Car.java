package abstraction;

public abstract class Car {
	
	public abstract void brake();
	
	public abstract void accelerate();
	
	public void gearShif() {
		System.out.println("This car is using gears!");
	}
	
	public void automatic() {
		System.out.println("This car doesn't use gears! Its automatic");
	}
}
