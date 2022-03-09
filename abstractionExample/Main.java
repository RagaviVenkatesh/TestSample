package abstractionExample;

public class Main extends AbstractClass{

	public void method1() {
		System.out.println("Abstract method");
		
	}
	
	public static void main(String[] args) {
		Main obj = new Main();
		
		obj.method1();
		
		obj.method2();
	}

}
