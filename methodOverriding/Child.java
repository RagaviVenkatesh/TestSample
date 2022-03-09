package methodOverriding;

public class Child extends Base{
	
	public void method1() {
		System.out.println("Child class method");
	}
	
	public int area(int l,int b) {
		return l*b;
	}
}
