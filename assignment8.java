package Assignment_8;

import java.util.Scanner;

public class assignment8 {

	public static void main(String[] args) {
		System.out.println("=========== Question 1 ===============");
		
			plus();

		System.out.println("=========== Question 2 ===============");
			
		cube();

		System.out.println("=========== Question 3 ===============");
		
			hello();
			world();

		System.out.println("=========== Question 4 ===============");
		
			printHallowRect();

		System.out.println("=========== Question 5 ===============");

			System.out.println("enter any positive or negative number:");
			Scanner scan = new Scanner(System.in);
			int number = scan.nextInt();
			sign(number);
		
		System.out.println("=========== Question 6 ===============");

			next3(39);

		System.out.println("=========== Question 7 ===============");

			boolean res = isPolindrome(112090211);
			System.out.println("is your number a polindrome: " + res);

		System.out.println("=========== Question 8 ===============");

			fib(18);

		System.out.println();
		System.out.println("=========== Question 9 ===============");

			System.out.println(max(11, 5));

		System.out.println("=========== Question 10 ===============");

			System.out.println("Is your number Even: " + isEven(5114));

		System.out.println("=========== Question 11 ===============");

			System.out.println("result of your trade is: " + "\"" + c_profit(1200, 1200) + "\"");

		System.out.println("=========== Question 12 ===============");

			boolean res1 = hamletQuote(false, true);
			System.out.println(" To be or not to be: " + res1);

		System.out.println("=========== Question 13 ===============");

			System.out.println(waterTax(151));
		 
		System.out.println("=========== Question 14 ===============");

			System.out.println("Does lock open: " + threeLocks(true, true, false));

		System.out.println("=========== Question 15 ===============");

			System.out.println("Is your to do list true: " + validateTask(false, 4, 3));

		System.out.println("=========== Question 16 ===============");

			boolean available = simpleRoomBook(true, 7, 15, 2018);
			System.out.println("is the room available: " + available);

		System.out.println("=========== Question 17 ===============");
		
			boolean blazz = GetThunderBlazz(true, false, 3, 2, 3);
			System.out.println("Can you drink Thunder Blazz: " + blazz);
		
		
		
	}
//======================methods used/called in the main method============================
	

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

// ======================Question 12==========================
	public static boolean hamletQuote(boolean b, boolean c) {
		boolean result = false;

		if (b || c) {

			result = true;
		}
		return result;
	}

	// ======================Question 13==========================

	public static double waterTax(double d) {

		double bill = 0;// TODO Auto-generated method stub

		if (d <= 50) {
			bill = d * 0.60;
		} else if (d > 50 && d <= 100) {
			bill = d * 0.90;
		} else if (d > 100 && d <= 150) {
			bill = d * 0.90 + 50;
		} else if (d > 150) {
			bill = d * 0.90 + 100;
		}
		return bill;

	}

	// ======================Question 14==========================

	public static boolean threeLocks(boolean b, boolean c, boolean d) {
		// TODO Auto-generated method stub
		boolean lock = false;
		if ((b && c) || d) {
			lock = true;
		}
		return lock;
	}

	// ======================Question 15==========================

	public static boolean validateTask(boolean a, int TaskId, int currentId) {
		boolean yesNo = false;
		if ((isNotEmpty(a)) && TaskId == currentId + 1) {
			yesNo = true;
		}

		return yesNo;

	}

	public static boolean isNotEmpty(boolean b) {
		boolean yesNo = false;
		if ((b == true)) {
			yesNo = true;
		}

		return yesNo;

	}

	// ======================Question 16==========================

	public static boolean simpleRoomBook(boolean b, int i, int j, int k) {
		// TODO Auto-generated method stub
		boolean available = false;

		if (isAvailable(!b) || k > 2018 || k < 2018 || (i == 7 && (j >= 1 && j <= 8))) {
			return available;
		} else {
			available = true;
		}

		return available;

	}

	public static boolean isAvailable(boolean yesNo) {
		boolean result = false;

		if (yesNo) {
			result = true;
		}
		return result;
	}
// ======================Question 17==========================		
	public static boolean GetThunderBlazz(boolean b, boolean c, int i, int j, int k) {
		boolean flag = false;

		if (availableAtStore(b) || getAsGift(c) || (i == 1 && j == 2 && k == 3) || (i == 3 && j == 2 && k == 1)) {
			flag = true;
		}
		return flag;

	}

	public static boolean availableAtStore(boolean a) {
		boolean flag = false;
		if (a) {
			flag = true;
		}
		return flag;

	}

	public static boolean getAsGift(boolean a) {
		boolean flag = false;
		if (a) {
			flag = true;
		}
		return flag;

	}
}
