package oops1;

abstract class Payment {

	void paymentInfo() {
		System.out.println("Payment System : Secure Online Payment");
	}

	abstract void validate();

	abstract void payAmount(double amount);
}

class UpiPayment extends Payment {

	@Override
	void validate() {
		System.out.println("UPI Validation : UPI ID verified");
	}

	@Override
	void payAmount(double amount) {
		System.out.println("UPI Payment    : Rs" + amount + " paid successfully");
	}
}

class CardPayment extends Payment {

	@Override
	void validate() {
		System.out.println("Card Validation: Card details verified");
	}

	@Override
	void payAmount(double amount) {
		System.out.println("Card Payment   : Rs" + amount + " paid successfully");
	}
}

public class Abstract_Payment_Demo {

	public static void main(String[] args) {

		Payment payment;

		payment = new UpiPayment();
		payment.paymentInfo();
		payment.validate();
		payment.payAmount(1500);

		System.out.println("------------------------");

		payment = new CardPayment();
		payment.paymentInfo();
		payment.validate();
		payment.payAmount(3200);
	}
}
