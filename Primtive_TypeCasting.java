package oops;

public class Primtive_TypeCasting {

	public static void main(String[] args) {

		int x = 50;
		double d = x; // widenning typecasting done by compiler

		double d1 = 50.65;
		int y = (int) d1; // Narrowing may cause dataloss while converting // 50.0

		System.out.println(y);
		System.out.println(d);

		int a = 5;
		int b = 2;
		double c = a / b;
		System.out.println(c); // 2.0 Reason: integer division happens before assignment.

		double a1 = 5;
		int b1 = 2;
		double c1 = a1 / b1;
		System.out.println(c); // 2.5 Reason: double division happens because higher datatype is double.

		// real world problem

		int sub = 3;
		int tmarks = 4531;

		double per = (double) (tmarks / sub); // because percentage comes in double Here : Narrowing Casting
		System.out.println("Percentage " + per);

	}

}
