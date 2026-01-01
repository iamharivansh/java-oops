package oops;

public class Encapsulation1 {

	final private String id;
	private double sal;
	private String name;

	private static int rnum = 701;

	public Encapsulation1(double sal, String name) {

		this.id = "TCS2025" + rnum++;
		this.sal = sal;
		this.name = name;
	}

	public void setName(String name) {

		this.name = name;

	}

	public String getName() {

		return name;
	}

	public void setSal(double sal) {

		this.sal = sal;
	}

	public double getSal() {

		return sal;
	}

	public String getID() {

		return id;

	}
	
	public static void main(String[] args) {
		
		//Encapsulation1 e1 = new Encapsulation1(2500, "Harivansh");
		// we can not access this object in another public class because e1 is local to this main method

	}

}
