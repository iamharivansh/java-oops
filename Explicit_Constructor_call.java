package oops;

class Laptop {

	String category;
	String dealername;

	public Laptop(String category, String dealername) {
		this.category = category;
		this.dealername = dealername;

	}

}

class Hp extends Laptop {
	int price;
	String model;

	Hp(String category, String dealername, int price, String model) {
		super(category, dealername);
		this.price = price;
		this.model = model;
	}

	void display() {
		System.out.println("laptop Name :" + model);
		System.out.println("Price is : " + price);
		System.out.println("Dealer Name is : " + dealername);

	}

}

public class Explicit_Constructor_call {
	public static void main(String[] args) {

		Hp h = new Hp("laptop", "Infotech", 25000, "HP13");
		h.display();

	}

}
