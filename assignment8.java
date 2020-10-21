package Assignment_8;

import java.util.Scanner;

public class assignment8 {

	public static void main(String[] args) {
//		System.out.println("=========== Question 1 ===============");
//		plus();
//
//		System.out.println("=========== Question 2 ===============");
//		cube();
//
//		System.out.println("=========== Question 3 ===============");
//		hello();
//		world();
//
//		System.out.println("=========== Question 4 ===============");
//		printHallowRect();
//
//		System.out.println("=========== Question 5 ===============");
//
//		System.out.println("enter any positive or negative number:");
//		Scanner scan = new Scanner(System.in);
//		int number = scan.nextInt();
//		sign(number);
//		System.out.println("=========== Question 6 ===============");
//
//		next3(39);
//
//		System.out.println("=========== Question 7 ===============");
//
//		boolean res = isPolindrome(112090211);
//		System.out.println("is your number a polindrome: " + res);
//
//		System.out.println("=========== Question 8 ===============");
//
//		fib(18);
//
//		System.out.println();
//		System.out.println("=========== Question 9 ===============");
//
//		System.out.println(max(11, 5));

		System.out.println("=========== Question 10 ===============");

		System.out.println("Is your number Even: " + isEven(5114));

		System.out.println("=========== Question 11 ===============");

		System.out.println("result of your trade is: " + "\"" + c_profit(1200, 1200) + "\"");

		System.out.println("=========== Question 12 ===============");
		
		boolean res=hamletQuote(false,true);
		System.out.println(" To be or not to be: "+ res);
		
		System.out.println("=========== Question 13 ===============");
		

	}

	

	// =======================Question 1====================================
	public static void plus() {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter first number:");
		int numFirst = scan.nextInt();
		System.out.println("enter second number:");
		int numSecond = scan.nextInt();
		int sumNumbers = numFirst + numSecond;
		System.out.println("result: " + sumNumbers);
	}

	// =======================Question 2====================================
	public static void cube() {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number:");
		int input = scan.nextInt();

		int cube = input * input * input;
		System.out.println("output: " + cube);
	}

	// =======================Question 3====================================
	public static void hello() {
		System.out.print("Hello ");
	}

	public static void world() {
		System.out.println("World!");
	}

	// =======================Question 4====================================
	public static void printHallowRect() {
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {
				if (i == 1 || i == 5) {
					System.out.print(" *");
				} else {
					if (j == 1 || j == 5) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
					}

				}
			}
			System.out.println();
		}

	}

//=======================Question 5====================================		
	public static void sign(int number) {

		Scanner scan = new Scanner(System.in);

		int sign;

		if (number > 0) {
			sign = 1;
		} else if (number < 0) {
			sign = -1;
		} else {
			sign = 0;
		}
		System.out.println("sign is:" + sign);
	}

//=======================Question 6====================================	

	public static void next3(int i) {
		System.out.println("next 3 are: \n" + (i + 1) + " " + (i + 2) + " " + (i + 3));

	}

//=================================Question 7===================================	
	public static boolean isPolindrome(int i) {

		boolean result = false;
		int numForDigit = i;
		int count = 1;
		while ((numForDigit / 10) != 0) {
			numForDigit /= 10;
			count++; // how many digits do we have
		}
		int digitValue = 1;
		for (int k = 1; k < count; k++) {
			digitValue *= 10;
		}
		// System.out.println(digitValue);// How many zeros do we have
		if (count == 1) {
			result = true;
		} else {
			for (int j = 1; j <= digitValue; j *= 10) {

				int m = (i % (j * 10)) / (j);
				int n = (i / (digitValue / j)) % 10;
				// System.out.println("m"+m);
				// System.out.println(" n" + n);
				if (m == n) {
					result = true;
				} else {
					result = false;
					break;
				}

			}

		}

		return result;

	}

//=============================Question 8======================
	public static void fib(int i) {

		int prenum1 = 0;
		int prenum2 = 1;
		int sum = 0;

		for (int j = 1; j <= i; j++) {
			System.out.print(prenum1);
			if (j < i) {
				System.out.print(", ");
			}
			sum = prenum1 + prenum2;
			prenum1 = prenum2;
			prenum2 = sum;

		}

	}

	// ===================Question 9================
	public static int max(int x, int max) {
		int result = 0;

		if (x > max) {
			result = max;
		} else {
			result = x;
		}

		return result;
	}

//===============Question 10===============

	public static boolean isEven(int i) {
		boolean result = false;
		if (i % 2 == 0) {
			result = true;
		}
		return result;

	}

//======================Question 11===================	
	public static String c_profit(int i, int j) {
		String result = "";

		if (j > i) {
			result = "profit";
		} else if (j < i) {
			result = "loss";
		} else {
			result = "no loss";
		}
		return result;
	}
// ======================Question 13==========================
	public static boolean hamletQuote(boolean b, boolean c) {
		boolean result=false;
		
		if (b||c) {
			
			result=true;
		}
		return result;
	}
	
	// ======================Question 14==========================	
	
	
	
	
	
	
	
	
	
	
	
}
