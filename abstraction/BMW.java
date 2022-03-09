package abstraction;

public class BMW extends Car{

	@Override
	public void brake() {
		System.out.println("This car is using breaks!");
		
	}

	@Override
	public void accelerate() {
		System.out.println("This car is using accelerators!");
		
	}

}
