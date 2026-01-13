package java_oops;

interface IPaymentMethod {

	String currency = "INR"; // public static final

	void pay(double amount);

	void refund(double amount);

}

class UPIMethod implements IPaymentMethod {

	@Override
	public void pay(double amount) {
		System.out.println("Aoumnt Rs. " + amount + " is paid Successfully");

	}

	@Override
	public void refund(double amount) {
		System.out.println("Amount Rs. " + amount + " is Refunded Successfully");
	}

}

class NetBanking implements IPaymentMethod {
	@Override
	public void pay(double amount) {
		System.out.println("Net Banking payment of " + amount + " " + currency);
	}

	@Override
	public void refund(double amount) {

		System.out.println("Net Banking refund of " + amount + " " + currency);

	}
}

public class Interface1 {

	public static void main(String[] args) {

		UPIMethod u = new UPIMethod();
		u.pay(2500);
		u.refund(1500);
		System.out.println("----------");

		NetBanking n = new NetBanking();
		n.pay(8502);
		n.refund(2055);

	}

}
