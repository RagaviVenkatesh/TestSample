package class_objects;

import java.util.Scanner;

public class AreaOfRectangle {
	
	int l; //instance variable
	int b;
	
	public AreaOfRectangle(int l, int b) {
		this.l = l;
		this.b = b;
	}
	
	int area() {
		return l*b;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int b = sc.nextInt();
		
		AreaOfRectangle obj = new AreaOfRectangle(l,b);
		int result = obj.area();
		System.out.println(result);
	}

}