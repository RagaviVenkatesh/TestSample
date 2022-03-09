package constructors;

public class NoParameter {
	
	String name;
	String rollno;
	boolean result;
	float cgpa;
	
	NoParameter(){
		System.out.println("Default constructor");
	}

	public static void main(String[] args) {
		
		NoParameter obj = new NoParameter();
		
		System.out.println(obj.name);
		
		System.out.println(obj.rollno);
		
		System.out.println(obj.result);
		
		System.out.println(obj.cgpa);

	}

}
