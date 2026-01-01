package oops;

class rollsroyce {

	String color; // non-static global variable
	int price;
	double speed;

	rollsroyce(String c, int p, double s) { // parameterized constructor with local var

		color = c;
		price = p;
		speed = s;

	} 

	void info() { // non-static method
		System.out.println("Car Color is : " + color + " Price :  " + price + " Speed : " + speed);
	}

}

public class ManufacturingPlant1 {

	public static void main(String[] args) {

		// creating object
		car c3 = new car();
		c3.display();
		rollsroyce r1 = new rollsroyce("purple", 150000, 150); // object 1
		r1.info();
		rollsroyce r2 = new rollsroyce("black", 146000, 180); // object 2
		r2.info();
		

	}

}
