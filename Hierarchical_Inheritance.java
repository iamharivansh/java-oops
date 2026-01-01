package oops;

class Product {

	int price;
	String pdname;
	double qnd;

	public Product(int price, String pdname, double qnd) {

		this.price = price;
		this.pdname = pdname;
		this.qnd = qnd;
	}

}

class Upi extends Product {

	public Upi(int price, String pdname, double qnd) {
		super(price, pdname, qnd);
	}

	void display() {

		double total = price * qnd;
		System.out.println("Product Name is : " + pdname);
		System.out.println("Price is : " + price + " Quantity : " + qnd);
		System.out.println("Total amount to pay : " + total);
		System.out.println(" \nThank you for Order");

	}

}

class Debitcard extends Product {

	public Debitcard(int price, String pdname, double qnd) {
		super(price, pdname, qnd);

	}

	void display() {

		double total = price * qnd;
		System.out.println("Product Name is : " + pdname);
		System.out.println("Price is : " + price + " Quantity : " + qnd);
		System.out.println("Total amount to pay : " + total);
		System.out.println(" \nThank you for Order");

	}

}

public class Hierarchical_Inheritance {

	public static void main(String[] args) {

		Debitcard d = new Debitcard(250, "Briyani", 5);
		d.display();

	}

}
