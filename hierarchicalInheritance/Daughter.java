package hierarchicalInheritance;

public class Daughter extends Father{
	String name;
	
	Daughter(){
		System.out.println("I'm Daughter. I inherit from Father");
		name = "Zaara";
	}
	
	void info() {
		System.out.println("Hey my name is "+this.name+" "+this.familyName+" and I'm from "+this.address);
	}
}
