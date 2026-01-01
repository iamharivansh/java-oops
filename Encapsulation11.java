package oops;

public class Encapsulation11 {

	public void display(Encapsulation1 e) {

		System.out.println("Employee ID : " + e.getID() + "\nName : " + e.getName() + " Sal " + e.getSal());

	}

	public static void main(String[] args) {

		Encapsulation1 e1 = new Encapsulation1(25200,"Harivansh");
		Encapsulation11 e2 = new Encapsulation11(); // creating obj to call non static methods
		// Non-static methods can be called only using an object of the same class.

		e2.display(e1);

	}
}
