package encapsulation;

public class Main {

	public static void main(String[] args) {
		Example1 obj = new Example1();
		
		obj.setName("Ragavi");
		
		System.out.println(obj.getName());
		
		//System.out.println(obj.name);
	}

}

//The line which is commented here is trying to access private variable which is 
//outsise the class

