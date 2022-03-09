package constructors;

import java.util.Scanner;

public class ParameterizedConstructor {
	
	String name;
	int rollno;
	boolean result;
	float cgpa;
	
	public ParameterizedConstructor(String name2, int i, boolean result2, float d) {
		this.name = name2;
		this.rollno = i;
		this.result = result2;
		this.cgpa = d;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int no = sc.nextInt();
		boolean res = sc.nextBoolean();
		float cgpa = sc.nextFloat();
		ParameterizedConstructor obj = new ParameterizedConstructor(name,no,res,cgpa);
		
		System.out.println(obj.name);
		
		System.out.println(obj.rollno);
		
		System.out.println(obj.result);
		
		System.out.println(obj.cgpa);
	}

}
