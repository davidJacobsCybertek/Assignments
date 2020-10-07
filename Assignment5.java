package assignment_5;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ===============================================================
		System.out.println();
		System.out.println("=========================Question 1=======================");
		System.out.println();
// =================Question 1===========================

		for (int i = 0; i <= 1000; i += 10) {
			System.out.print(i);
			if (i < 1000) {
				System.out.print(",");
			}
		}
		
		
		// ===============================================================
		
		System.out.println();System.out.println();
		System.out.println("=========================Question 2=======================");
		System.out.println();
// =================Question 2===========================
		
		for (int i=3;i<=130;i++) {
			
			if (i%2!=0) {
				System.out.print(i+" ");
			}
			
		}
		
		
		// ===============================================================
		System.out.println();System.out.println();
		System.out.println("=========================Question 3=======================");
		System.out.println();
// =================Question 3===========================
		for (int i=5;i<=50;i++) {
			if (i%2==0) {
			System.out.print(i+ " ");
			}
		}
		
		
		// ===============================================================
		System.out.println();System.out.println();
		System.out.println("=========================Question 4=======================");
		System.out.println();
// =================Question 4===========================
	
		int userNum=2;
		int product=0; 
		
		while (product < 100) {
			
			product=userNum*10;
			
			System.out.println(product);
			
			userNum++;
					
		}
		
		
		
		// ===============================================================
		System.out.println();
		System.out.println("=========================Question 5=======================");
		System.out.println();
// =================Question 5===========================
		
		for (int i=1;i<=10;i++) {
			
			System.out.println(12 + " X " + i + " = " + (i*12));
			
		}
		
		
		
		// ===============================================================
		System.out.println();
		System.out.println("=========================Question 6=======================");
		System.out.println();
// =================Question 6===========================
		
		int nn = 22;
		int numm1 = 0;
		int numm2 = 1;
		int summ = 0;
		for (int i = 0; i < nn; i++) {

			System.out.print(numm1 + ",");

			summ = numm1 + numm2;
			numm1 = numm2;
			numm2 = summ;

		}
			
		
			
			
		
		
		// ===============================================================
				System.out.println();System.out.println();
				System.out.println("=========================Question 7=======================");
				System.out.println();
	// =================Question 7===========================
		
		
		for (int i=1;i<=100;i++) {
			
			if (i%5==0) {
				System.out.print(i+" ");
			}
		}
		
		
		// ===============================================================
		System.out.println();
		System.out.println();
		System.out.println("=========================Question 8=======================");
		System.out.println();
		// =================Question 8===========================
		
		int n=0;
		int sumOfN=0;
		int upperBond=100;
		while (n<=upperBond) {
			sumOfN+=n;
			n++;
		}
		System.out.println("sum is: "+sumOfN);
		
		
		// ===============================================================
		System.out.println();
		System.out.println("=========================Question 9=======================");
		System.out.println();
		// =================Question 9===========================

		int num = 0;
		int end = 75;
		while (num < end) {
			num++;
			if (num % 2 != 0 && num < end) {

				System.out.print(num + ", ");

			} else if (num == end) {

				System.out.println(num);
			} else {
				continue;
			}
		}



	// ===============================================================
	System.out.println();System.out.println("=========================Question 10=======================");System.out.println();
	// =================Question 10===========================

	for(int i = 1;i<=7;i++)
	{

		for (int j = 1; j <= i; j++) {
			System.out.print(i);
		}
		System.out.println();

	}

	// ===============================================================
	System.out.println();System.out.println("=========================Question 11=======================");System.out.println();
	// =================Question 11===========================

	for(int i = 1;i<=4;i++)
	{
		for (int k = 1; k <= i; k++) {
			System.out.print("  ");

		}

		for (int j = 4; j >= i; j--) {

			System.out.print((j - i + 1) + "   ");
		}
		System.out.println();
		System.out.println();

	}

	// ===============================================================
	System.out.println();System.out.println("=========================Question 12=======================");System.out.println();
	// =================Question 12===========================

	for(int i = 1;i<=10;i++)
	{

		for (int j = 1; j <= 10; j++) {

			System.out.print(i * j + " ");

		}
		System.out.println();

	}

	// ===============================================================
	System.out.println();System.out.println("=========================Question 13=======================");System.out.println();
	// =================Question 13===========================
	int white = 8;
	int black = 8;

	for(
	int i = 1;i<=white;i++)
	{
		if (i % 2 != 0) {
			System.out.print("W");

			for (int j = 1; j < black; j++) {
				if (j % 2 != 0) {
					System.out.print(" B");
				} else {
					System.out.print(" W");
				}

			}
			System.out.println();
		} else {
			System.out.print("B");
			for (int j = 1; j < black; j++) {
				if (j % 2 != 0) {
					System.out.print(" W");
				} else {
					System.out.print(" B");
				}

			}
			System.out.println();
		}

	}

	// ===============================================================
	System.out.println();System.out.println("=========================Question 14=======================");System.out.println();
	// =================Question 14==========================
	int row = 7;for(
	int i = 0;i<row;i++)
	{

		System.out.print("#");

		for (int j = 1; j < i; j++) {
			System.out.print(" ");

		}
		System.out.println("#");
	}

}

}
