package abstractionExample;

abstract class AbstractClass {
	
	AbstractClass(){
		System.out.println("Constructor");
	}
	
	public abstract void method1();
	
	public void method2() {
		System.out.println("Non abstract method");
	}
}
