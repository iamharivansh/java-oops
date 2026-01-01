package oops;

public class Final_UniqueID_Generation {

	// first create the id final and then assign private static variable to final
	// variable

	final String empid; // non-static global variable
	String name;
	double sal;

	private static int rnum = 701; // static global variable

	public Final_UniqueID_Generation(String name, double sal) { // local variables
		this.name = name;
		this.sal = sal;
		this.empid = "TCS2025" + rnum++;
	}
	
	void display() {
		
		System.out.println("Empid : "+empid+ "\nEmployee name is : "+name+ "\nSal is : "+sal+"\n");
	}
	
	public static void main(String[] args) {
		
		Final_UniqueID_Generation obj = new Final_UniqueID_Generation("Harivansh",25000);
		obj.display();
		
		//obj.empid="TCS20026125";//can not because empid is final variable
		obj.name="Sandeep";
		obj.display();

		Final_UniqueID_Generation obj1 = new Final_UniqueID_Generation("Ram",25000);
		obj1.display();

	}

}
