package oops;

import java.util.Scanner;

public class Method_Overloading {

	int sum(int a, int b) {
		return a + b;
	}

	int sum(int a, int b, int c) {
		return a + b + c;
	}

	int sum(int a, int b, int c, int d) {
		return a + b + c + d;
	}

	int sum(int a, int b, int c, int d, int e) {
		return a + b + c + d + e;
	}

	public static void main(String[] args) {

		Method_Overloading m = new Method_Overloading();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter how many numbers you want to add");
		int num = sc.nextInt();

		switch (num) {

		case 2:
			System.out.println("Enter 1st Number");
			int num1 = sc.nextInt();

			System.out.println("Enter 2nd Number");
			int num2 = sc.nextInt();

			System.out.println("Sum = " + m.sum(num1, num2));
			break;

		case 3:
		System.out.println("Enter 1st Number");
			int a = sc.nextInt();

			System.out.println("Enter 2nd Number");
			int b = sc.nextInt();

			System.out.println("Enter 3rd Number");
			int c = sc.nextInt();

			System.out.println("Sum = " + m.sum(a, b, c));
			break;

		case 4:
			System.out.println("Enter 1st Number");
			int d = sc.nextInt();

			System.out.println("Enter 2nd Number");
			int e = sc.nextInt();

			System.out.println("Enter 3rd Number");
			int f = sc.nextInt();

			System.out.println("Enter 4th Number");
			int g = sc.nextInt();

			System.out.println("Sum = " + m.sum(d, e, f, g));
			break;

		case 5:
			System.out.println("Enter 1st Number");
			int h = sc.nextInt();

			System.out.println("Enter 2nd Number");
			int i = sc.nextInt();

			System.out.println("Enter 3rd Number");
			int j = sc.nextInt();

			System.out.println("Enter 4th Number");
			int k = sc.nextInt();

			System.out.println("Enter 5th Number");
			int l = sc.nextInt();

			System.out.println("Sum = " + m.sum(h, i, j, k, l));
			break;

		default:
			System.out.println("Please enter number between 2 to 5");
		}

		sc.close();
	}
}
