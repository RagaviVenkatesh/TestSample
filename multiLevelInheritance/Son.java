package multiLevelInheritance;

public class Son extends Father{

	
	String name;
	
	Son(){
		System.out.println("I'm Son. I inherit from Father");
		name = "abc";
	}
	
	void info() {
		System.out.println("Hey my name is "+this.name+" "+this.familyName+" and I'm from "+this.address);
	}

	public static void main(String[] args) {
		Son obj = new Son();
		obj.info();

	}

}
