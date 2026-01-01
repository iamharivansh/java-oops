package oops;

// same class same package

public class Access_Specifier {

	public String name;
	protected int id;
	double sal;
	private int age;

	public Access_Specifier(String name, int id, double sal, int age) {

		this.name = name;
		this.id = id;
		this.sal = sal;
		this.age = age;
	}

	public void race1() {
		System.out.println("This is public method");
	}

	protected void race2() {
		System.out.println("This is Protected method");
	}

	void race3() {
		System.out.println("This is Package level method");
	}

	private void race4() {
		System.out.println("This is Private Method");
	}

	public static void main(String[] args) {

		Access_Specifier ac = new Access_Specifier("Harivansh", 25, 2500, 25);
		System.out.println(ac.name);
		System.out.println(ac.id);
		System.out.println(ac.sal);
		System.out.println(ac.age);

		ac.race1();
		ac.race2();
		ac.race3();
		ac.race4();

	}

}
