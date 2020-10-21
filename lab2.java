import java.util.Scanner;

public class lab2 {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("============question 1==============");
		System.out.println();

		Scanner scan = new Scanner(System.in);
		int smallest, largest;
		int yesNo, next;
		System.out.println("Enter your first number");
		int first = scan.nextInt();
		System.out.println("Enter second first number");
		int second = scan.nextInt();
				if (first < second) {
					smallest = first;
					largest = second;
				} else {
					smallest = second;
					largest = first;
				}
		do {
			System.out.println("Do you want to add another number: 0-No, 1-Yes");
			yesNo = scan.nextInt();
				if (yesNo==0) {
					break;
				}
		System.out.println("Enter your next number");
		next = scan.nextInt();
		
				if (next > largest) {
					largest = next;
				} else if (next < smallest) {
					smallest = next;
				}
				
		} while (yesNo == 1);
		
		System.out.println("Smallest Number is: "+ smallest);
		System.out.println("Largest Number is: "+ largest);
	

	System.out.println();
	System.out.println("============question 2==============");
	System.out.println();
	
	
	System.out.println("Please enter the number of cookies you ate:");
	
	int numCookies=scan.nextInt();
	int totalCalories=(300/(40/10))*numCookies;
	System.out.println("Total calories you have consumed :" + totalCalories);
	
	System.out.println();
	System.out.println("============question 3==============");
	System.out.println();
	
	System.out.println("Please enter a positive number:");
	
	int numPositive=scan.nextInt();
	int sumNumPositive=0;
	for (int i=1; i<=numPositive;i++) {
		
		sumNumPositive+=i;
		
	}
	System.out.println("Sum of all positive integers up to your number is: " + sumNumPositive);
	
	System.out.println();
	System.out.println("============question 4==============");
	System.out.println();
	
	
	System.out.println("Please enter the number of Females registered: ");
	double females=scan.nextDouble();
	
	System.out.println("Please enter the number of Males registered: ");
	double males=scan.nextDouble();
	
	double sumClass=females+males;
	
	int percentageFemales=(int)((females/sumClass)*100);
	int percentageMales=100-percentageFemales;
	
	System.out.println("Females percentage in the class is: " + percentageFemales+ "%");
	System.out.println("Males percentage in the class is: " + percentageMales+ "%");
	
	
	System.out.println();
	System.out.println("============question 5==============");
	System.out.println();
	
	System.out.println("Please enter the meal charge:");
	double meal = scan.nextDouble();
	double tax=meal*6.75/100;
	double tip=(meal+tax)*0.20;
	double total=meal+tip+tax;
	
	System.out.println("Meal Charge \t: " + meal );
	System.out.println("Tax Amount \t: " + tax );
	System.out.println("Tip Amount \t: " + tip );
	System.out.println("Total Bill \t: " + total );
	
	
	System.out.println();
	System.out.println("============question 6==============");
	System.out.println();
	
	System.out.println("Please enter the amount of Purchase");
	double purchase=scan.nextDouble();
	double taxState=purchase*0.04;
	double taxCaunty=purchase*0.02;
	double taxTotal=taxCaunty+taxState;
	double totalOfSale=purchase+taxTotal;
	
	System.out.println("purchase Amount \t:" +purchase);
	System.out.println("State Sales Tax \t:" +taxState);
	System.out.println("County Sales Tax \t:" +taxCaunty);
	System.out.println("Total Sales Tax \t:" +taxTotal);
	System.out.println("Total of Sale \t\t:" +totalOfSale);
	
	
}
}
