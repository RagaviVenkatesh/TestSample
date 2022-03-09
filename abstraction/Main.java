package abstraction;

public class Main {

	public static void main(String[] args) {
		Audi a = new Audi();
		
		BMW b = new BMW();
		
		a.accelerate();
		a.brake();
		a.gearShif();
		
		b.accelerate();
		b.brake();
		b.automatic();

	}

}
