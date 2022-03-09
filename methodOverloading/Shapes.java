package methodOverloading;

public class Shapes {
	
	public float area(float length, int breadth) {
		return length*breadth;
	}
		
	public int area(int side) {
		return side*side;
	}
	
	public int area(int length, int breadth) {
		return length*breadth;
	}
	
	public float area(int length, float breadth) {
		return length*breadth;
	}
	
	public float area(float base, float height) {
		return (1.0f/2.0f)*base*height;
	}
	
	
	public static void main(String[] args) {
		
		Shapes obj = new Shapes();
		System.out.println(obj.area(50.0f,20));
		System.out.println(obj.area(5)); 
		System.out.println(obj.area(10,20));		
		System.out.println(obj.area(100.0f,20.0f));
	}
}
