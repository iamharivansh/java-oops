package oops;

class granny {
	void care() {
		System.out.println("Caring");
	}
}

class mom extends granny {
	void love() {
		System.out.println("loving");
	}

}

class daughter extends mom {
	void kalesh() {
		System.out.println("doing Kalesh");
	}

}

public class Multilevel_Inheritance {

	public static void main(String[] args) {

		daughter d = new daughter();
		System.out.println("Daughter subclass");
		d.care();
		d.love();
		d.kalesh();
		
		System.out.println("Mom class");
		
		mom m = new mom();
		m.care();
		m.love();
	
	}

}
