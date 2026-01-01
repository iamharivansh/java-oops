package oops;

public class Static_Block_Var {

	static String type;
	int price;

	static {
		System.out.println("Static Block 1");
		type = "Hyderabadi";
	}

	public static void main(String[] args) {
		System.out.println("Main Start");
		System.out.println(type);
		System.out.println("Main End");

	}

	static {
		System.out.println("Static block 2");
		type = "Dum Briyani";
		

	}
	static {
		System.out.println("Static block 3");
		type="Bamboo Briyani";
	
	}

}
