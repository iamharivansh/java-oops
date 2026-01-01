package oops;

// diff class same package
public class Access_Speicifer1 {

	public static void main(String[] args) {

		Access_Specifier ac = new Access_Specifier("Harivansh", 25, 2500, 25);

		System.out.println(ac.name);
		System.out.println(ac.id);
		System.out.println(ac.sal);
		// System.out.println(ac.age); CTE because we only access in same class

		ac.race1();
		ac.race2();
		ac.race3();
		// ac.race4(); CTE

	}

}
