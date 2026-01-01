package oops;

class banksystem {

	int accountNumber;
	int balance;

	public banksystem(int accountNumber, int balance) {

		this.accountNumber = accountNumber;
		this.balance = balance;

	}

	void DisplayBal() {
		System.out.println("Your Balance is : " + balance);
	}

	void DisplayDl() {
		System.out.println("Your Balance is " + balance + " Your Account Number is " + accountNumber);

	}
}

public class This_keyword1 {

	public static void main(String[] args) {

		banksystem shivam = new banksystem(815800, 25000);
		shivam.DisplayBal();
		banksystem sahil = new banksystem(128590, 9600);
		sahil.DisplayDl();

	}

}
