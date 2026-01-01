package oops;

class hello {

	static {
		System.out.println("this is static block 1");
	}
}

public class Blocks_Static {

	static {
		System.out.println("This is static block 2");
	}

	public static void main(String[] args) {
	 new hello();
		

		System.out.println("This is main method");

	}

	static {
		System.out.println("This is static block 3");

	}

}
