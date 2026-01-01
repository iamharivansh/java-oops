package oops;

class car {

	String color; // non static global var
	int price;
	int speed;

	void display() {
		System.out.println(color + " " + price + " " + speed);
	}

}


public class Default_Intilization {
	public static class carss{
		String color;
		
		
		
	}


	public static void main(String[] args) {
		
		car c1 = new car();
		System.out.println("Before Intilazation");
		c1.display();
		c1.color = "black";
		c1.price = 15000;
		c1.speed = 170;
		System.out.println("After Intialization");
		c1.display();

		car c2 = new car();
		System.out.println("Before Intilazation");
		c2.display();
		c2.color = "Green";
		c2.price = 15000;
		c2.speed = 190;
		System.out.println("After Intialization");
		c2.display();

	}

}
