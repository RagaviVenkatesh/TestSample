package methodOverriding;

public class Main {

	public static void main(String[] args) {
		
		Child obj = new Child();
		obj.method1();
		System.out.println(obj.area(5));
		System.out.println(obj.area(5,10));
	}

}


//The child class will override the base class