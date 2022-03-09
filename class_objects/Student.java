package class_objects;

public class Student {
	
	String name;
	int rollno;
	int age;
	
	public Student(String sName,int sRoll,int sAge) {
		this.name = sName;
		this.rollno = sRoll;
		this.age = sAge;
	}
	
	void info() {
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollno);
		System.out.println("Age: "+age);
	}

	public static void main(String[] args) {
		Student student = new Student("Dinesh",4,12);	
		student.info();
		
		Student student1 = new Student("Naveen",33,13);
		student1.info();
		
		Student student2 = new Student("Kannan",15,12);
		student2.info();
	}

}
