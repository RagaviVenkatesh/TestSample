package hybridInheritance;

public class Main {

	public static void main(String[] args) {
		
		D d = new D(); // It will invoke constructors of parent class A and B, d
		
		B b = new B(); // It will invoke constructors of parent class A and B
		
		C c = new C(); //It will invoke constructors of parent class A and C

	}

}
