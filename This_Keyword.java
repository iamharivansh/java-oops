package oops;

class cybercab {

	String color;
	int speed;
	double bcap;

	cybercab(String color, int speed, double bcap) {

		this.color = color;
		this.speed = speed;
		this.bcap = bcap;
		System.out.println("Address " + this);
	}

	cybercab(String color) {
		this.color = color;
	}

	cybercab() {
		System.out.println("Addrees of non parameterized " + this);
	}

	void display() {
		System.out.println("color : " + color + "speed : " + speed + "bcap : " + bcap);
	}

}

public class This_Keyword {

	public static void main(String[] args) {

		cybercab c1 = new cybercab();
		System.out.println(c1);
		c1.display();
		cybercab c2 = new cybercab("Black", 1500, 150);
		System.out.println(c2);
		c2.display();
		cybercab c3 = new cybercab("Purple");
		System.out.println(c3);
		c3.display();

	}

}
