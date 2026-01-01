package oops;

class GFather {

	GFather() {
		System.out.println("Inside GFather Constructor");
	}
}

class Fathr extends GFather {
	Fathr() {
		System.out.println("Hello from Father Constructor");
	}
}

class Son extends Fathr {
	Son() {
		System.out.println("Hi from son constructor ");

	}

}

public class Implicit_ConstrucotrCall {
	
	public static void main(String[] args) {
		
		Son s = new Son();
		
	}

}
