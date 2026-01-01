package oops;
//at the time of object creation
//non static block runs first and then constructor 

class blocks {
	blocks() {
		System.out.println("This is Constructor \n");
	}

	{
		System.out.println("This is non static block 1");
	}
	{
		System.out.println("This is non static block 2");
	}

}

public class NonStatic_Block {

	public static void main(String[] args) {
		System.out.println("Main Start");
		blocks b1 = new blocks();
		blocks b2 = new blocks();
		blocks b3 = new blocks();
		System.out.println("Main end");

	}

	{
		System.out.println("This is non static block 3");
	}

}
