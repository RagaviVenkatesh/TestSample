package multiLevelInheritance;

public class Father extends GrandFather{
	
	String address;
	
	Father(){
		System.out.println("I'm Father. I inherit from GrandFather");
		this.address = "qwert";
	}
}
