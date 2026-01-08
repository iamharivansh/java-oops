package oops1;

class Person {
	String name;
	int age;
	char gen;

	public Person(String name, int age, char gen) {
		super();
		this.name = name;
		this.age = age;
		this.gen = gen;
	}

	void info() {
		System.out.println("Name is " + name + " Age : " + age + " Gender : " + gen);

	}

}

//Student Class

class Student extends Person {
	int roll;
	double per;
	String college;

	public Student(String name, int age, char gen, int roll, double per, String college) {
		super(name, age, gen);
		this.roll = roll;
		this.per = per;
		this.college = college;
	}

	@Override
	void info() {
		System.out.println("Name is " + name + " Age : " + age + " Gender : " + gen);
		System.out.println("Roll no is " + roll + "Percentage : " + per + "College name : " + college);
	}

}

// Employee Class

class Employee extends Person {
	int empid;
	double sal;
	String desig;

	public Employee(String name, int age, char gen, int empid, double sal, String desig) {
		super(name, age, gen);
		this.empid = empid;
		this.sal = sal;
		this.desig = desig;
	}

	@Override
	void info() {
		System.out.println("Name is " + name + " Age : " + age + " Gender : " + gen);
		System.out.println("empid  is " + empid + "Salary : " + sal + "Designation  : " + desig);

	}
}

class Goverment {

	void addharCard(Person p) {

		System.out.println(p.name + " Will get Adhar Card ");

	}

	// Specialized Method

	void scholarShip(Student s) {
		if (s.per > 85) {
			System.out.println(s.name + "will get Scolarship");

		} else {
			System.out.println(s.name + "Percetange is too low");
		}

	}

	// Specialized Method

	void taxPayment(Employee e) {

		if (e.sal * 12 > 1000000) {
			System.out.println(e.name + "Should pay " + (e.sal * 12 * 0.18) + " /-rs Only");

		} else {
			System.out.println("Money is not applicable for tax");
		}

	}
}

public class Election_Generalization_Specailization {

	// Generalized Method

	public static void main(String[] args) {

		Person p1 = new Person("Harivansh", 25, 'M');
		Student s1 = new Student("Shivam", 19, 'M', 210, 89, "RJ College");
		Employee e1 = new Employee("Ritik", 25, 'M', 6593, 58000, "SDE");

		Goverment g1 = new Goverment();
		g1.addharCard(p1);
		g1.addharCard(s1);
		g1.addharCard(e1);

		System.out.println("-------");

		// g1.scholarShip(p1); // CTE
		g1.scholarShip(s1);
		// g1.scholarShip(e1); // CTE

		System.out.println("-----");

		// g1.taxPayment(p1);
		g1.taxPayment(e1);
		// g1.taxPayment(s1);

 	}
}
