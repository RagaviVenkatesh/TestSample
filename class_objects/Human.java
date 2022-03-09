package class_objects;

import java.util.Scanner;

public class Human {
	
	String name;
	int age;
	int height;
	
	public Human(String objName, int objAge, int objHeight) {
		this.name = objName;
		this.age = objAge;
		this.height = objHeight;
	}
	
	public void display() {
		System.out.println("Name: "+name+" Age: "+age+" Height: "+height);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String humanName = sc.next();
		int humanAge = sc.nextInt();
		int humanHeight = sc.nextInt();
		Human obj1 = new Human(humanName,humanAge,humanHeight);
		
		humanName = sc.next();
		humanAge = sc.nextInt();
		humanHeight = sc.nextInt();
		Human obj2 = new Human(humanName,humanAge,humanHeight);

		obj1.display();
		obj2.display();
		
		
	}

}
