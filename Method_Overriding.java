package oops;

class Bank {

	double getRateOfInterest() {
		return 5.0;
	}
}

class SBI extends Bank {

	@Override
	double getRateOfInterest() {
		return 6.5;
	}
}

class HDFC extends Bank {

	
	double getRateOfInterest() {
		return 7.0;
	}
}

public class Method_Overriding {

	public static void main(String[] args) {

		Bank b1 = new Bank();
		System.out.println("Bank Interest: " + b1.getRateOfInterest() + "%");

		Bank b2 = new SBI();
		System.out.println("SBI Interest: " + b2.getRateOfInterest() + "%");

		Bank b3 = new HDFC();
		System.out.println("HDFC Interest: " + b3.getRateOfInterest() + "%");
	}
}
