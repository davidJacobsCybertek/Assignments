package assignment_6;

public class Assignmet6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("======================================Question-1====================");
		System.out.println();
//===========================================================Question-1========================
		int max = 7;

		for (int i = 1; i < max * 2; i++) {

			if (i <= max) {

				for (int j = 1; j <= i; j++) {

					System.out.print(j);
				}

			}

			else {
				for (int k = 1; k <= (max * 2 - i); k++) {

					System.out.print(k);
				}
			}
			System.out.println();

		}
		System.out.println("======================================Question-2====================");
		System.out.println();
		// ===========================================================Question-2========================
		int max2 = 7;

		for (int i = 1; i < max2 * 2; i++) {

			if (i < max2) {

				for (int j = 1; j <= max2 - i + 1; j++) {

					System.out.print(j);
				}

			}

			else {
				for (int k = 1; k <= i - max2 + 1; k++) {

					System.out.print(k);
				}
			}
			System.out.println();

		}

		System.out.println("======================================Question-3====================");
		System.out.println();
		// ===========================================================Question-3========================

		int max3 = 7;

		for (int i = 1; i < max3 * 2; i++) {

			if (i <= max3) {
				for (int m = 1; m < i; m++) {
					System.out.print(" ");
				}
				for (int j = i; j <= max3; j++) {

					System.out.print(j + " ");
				}

			}

			else {

				for (int m = 1; m < max3 * 2 - i; m++) {
					System.out.print(" ");
				}
				for (int k = max3 * 2 - i; k <= max3; k++) {

					System.out.print(k);
					System.out.print(" ");
				}
			}
			System.out.println();

		}

		System.out.println("======================================Question-4====================");
		System.out.println();
		// ===========================================================Question-4========================

		int max4 = 7;

		for (int i = 1; i <= max4; i++) {

			for (int j = 1; j <= i; j++) {

				if (j % 2 == 1) {

					System.out.print(1);
				} else {
					System.out.print(0);
				}
			}
			System.out.println();
		}

		System.out.println("======================================Question-5====================");
		System.out.println();
		// ===========================================================Question-5========================
		int max5 = 7;
		for (int i = 1; i <= max5; i++) {

			for (int j = i; j < max5; j++) {

				System.out.print(1);
			}

			for (int k = max5; k > max5 - i; k--) {
				System.out.print(i);

			}

			System.out.println();
		}
		System.out.println("======================================Question-6====================");
		System.out.println();
		// ===========================================================Question-6========================

		int max6 = 5;

		for (int i = 1; i <= max6; i++) {

			for (int j = 1; j <= i; j++) {
				if (j == 1) {

					System.out.print(i+" ");
				} else if (j == 2) {
					System.out.print(i + 4+" ");
				}else if (j==3) {
					System.out.print(i+7+" ");
				}else if (j==4) {
					System.out.print(i+9+" ");
				}else if (j==5) {
					System.out.print(i+10+" ");
				}

			}
			System.out.println();
		}

		
		
		
		
		
	}
}
