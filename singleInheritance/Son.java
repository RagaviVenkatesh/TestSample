package singleInheritance;

public class Son extends Father{
	String name;
	
	Son(){
//		super();
		System.out.println("Child class constructor");
		name = "abc";
	}
	
	void info() {
		System.out.println("Hey my name is "+this.name+" "+this.familyName+" and I'm from "+this.address);
	}

	public static void main(String[] args) {
		
		Son obj = new Son();
		obj.info();
		obj.display();
	}

}
