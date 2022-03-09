package singleInheritance;

public class Father {
	String familyName;
	String address;
	
	Father(){
		System.out.println("Super class constructor");
		familyName = "xyz";
		address = "dfgjiuytrs";
	}
	
	public void display() {
		System.out.println("Super class method");
	}
}
