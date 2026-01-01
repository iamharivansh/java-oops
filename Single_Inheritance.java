package oops;

class Father {

	void house() {
		System.out.println("2bhk house");
	}

	void gold() {
		System.out.println("10 kg gold");
	}

	 void land() {
		System.out.println("100 acres Land");
	}

}

class Child extends Father {

	void drugs() {
		System.out.println("Drugs ...");
	}

}

public class Single_Inheritance {

	public static void main(String[] args) {

		
		Father f = new Father();
		f.gold();
		f.land();
		//f.drugs(); CTE 
		
	
		Child c = new Child();
		c.gold();
		c.land();
		c.drugs();

	}

}
