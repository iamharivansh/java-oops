package oops;

class college {

	String clname = "R J College Mumbai";
	String add = "Ghatkopar Mumbai";

}

class teacher extends college {

	String name;
	double sal;

	public teacher(String name, double sal) {
		super();
		this.name = name;
		this.sal = sal;
	}

	void display() {

		System.out.println("College Name : " + clname);
		System.out.println("Address : " + add);
		System.out.println("Teacher Name : " + name + " and his Salary is : " + sal);

	}

}

class Student extends college {

	String name;
	int age;
	String std;

	public Student(String name, int age, String std) {
		super();
		this.name = name;
		this.age = age;
		this.std = std;
	}

	void display() {
		System.out.println("College Name : " + clname);
		System.out.println("Address : " + add);
		System.out.println("Studnet Name is  : " + name);
		System.out.println("Age : " + age);
		System.out.println("Standard : " + std + "\n");

	}

}

class GrdStudent extends Student {

	public GrdStudent(String name, int age, String std) {
		super(name, age, std);
	}

}

public class Hybrid_Inheritance {

	public static void main(String[] args) {

		System.out.println("Studnet Details");
		GrdStudent g = new GrdStudent("Harivansh", 24, "MCA");
		g.display();

		System.out.println("Teacher Details");
		teacher t = new teacher("Rajat Sir", 80000);
		t.display();

	}

}
