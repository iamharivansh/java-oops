package oops;

class Person {
	String name;
	int age;
	char gen;

	public Person(String name, int age, char gen) {

		this.name = name;
		this.age = age;
		this.gen = gen;

		System.out.println("Inside Person Const");
	}

}

class Studd extends Person {

	int rollno;
	double per;
	String College;

	public Studd(String name, int age, char gen, int rollno, double per, String college) {
		super(name, age, gen);
		this.rollno = rollno;
		this.per = per;
		College = college;
		System.out.println("Inside Studnent Const");

	}

	void display() {

		System.out.println("Student Name is : " + name);
		System.out.println("Student Age is : " + age);
		System.out.println("Student gender is : " + gen);
		System.out.println("Student Rollno is : " + rollno);
		System.out.println("Student Percentage is : " + per);
		System.out.println("Student College name is : " + College + "\n ");

	}

}

class Employee extends Person {

	int empid;
	double sal;
	String Design;

	public Employee(String name, int age, char gen, int empid, double sal, String design) {
		super(name, age, gen);
		this.empid = empid;
		this.sal = sal;
		Design = design;

		System.out.println("Inside Employee Const ");
	}

	void display() {

		System.out.println("Employee Name is : " + name);

		System.out.println("Employee Age is : " + age);

		System.out.println("Employee gender is : " + gen);

		System.out.println("Employee Empid is : " + empid);

		System.out.println("Employee Salary is : " + sal);

		System.out.println("Employee Desgination  is : " + Design + "\n ");

	}

}

public class Constructor_Chaining {

	public static void main(String[] args) {

		System.out.println("Studnet Details \n ");
		Studd s = new Studd("Shivam", 25, 'M', 12, 98.63, "RJ College");
		s.display();

		System.out.println("Employee Details ");
		Employee e1 = new Employee("Harivansh", 25, 'M', 336, 45000, "Software Developer");
		e1.display();

		Employee e2 = new Employee("Ritik", 25, 'M', 3361, 50000, "Software Developer");
		e1.display();

	}

}
