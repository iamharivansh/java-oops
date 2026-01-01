package oops;

class login {
	String email;
	int pass;
	long phno;

	public login(String email, int pass, long phno) {
		System.out.println("login with mail and phno");
		this.email = email;
		this.pass = pass;
		this.phno = phno;
	}

	public login(int pass, long phno) {
		System.out.println("login with phno");
		this.pass = pass;
		this.phno = phno;
	}
	public login(long phno, int pass) {
		
		this.phno=phno;
		this.pass=pass;
	}

	void display() {
		System.out.println("Login succesful " + email);
	}

	void display1() {
		System.out.println("Login Successful " + phno);
	}

}

public class Constructor_Overloading {

	public static void main(String[] args) {
		login l1 = new login("iamharivansh@gmaol", 154566, 5411212l);
		l1.display();
		login l2 = new login(12556, 88590460l);
		l2.display1();
		login l3 = new login(151545415l,125585);
		l3.display1();

	}

}
