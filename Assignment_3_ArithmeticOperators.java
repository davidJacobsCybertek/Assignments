package Assignment_3_ArithmeticOperators;

public class Assignment_3_ArithmeticOperators {

	public static void main(String[] args) {
			
		System.out.println("Question-1");
		System.out.println("");
		
			double galons, liters;
			galons=15; //  Input gallon amount here
			liters = galons*3.7854;			 
			
			System.out.println(galons + " galon is " + liters + " liter");
			
		System.out.println("--------------------------------------------");
		System.out.println("Question-2");
		System.out.println("");
		
			String name ="David";  // Input your name here
			final int birthday = 1978;  // Input your year of birth here
			int yearNow= 2020;
			int age = yearNow-birthday;
			
			System.out.println("\" Hello, " + name + "! Based on your input, your age is " + age + " :) \"");

		System.out.println("--------------------------------------------");
		System.out.println("Question-3");
		System.out.println("");
		
			double width= 4.5;  // Input width of rectanle
			double height= 7.9; // // Input height of rectanle
			double area= width*height;
			
			System.out.println("Area of the rectangle is = " + area);
		
		System.out.println("--------------------------------------------");	
		System.out.println("Question-4");
		System.out.println("");
		
			int n1=10;  // Input 2 numbers
			int n2=20;
			int n3;
						
			System.out.println("n1="+n1);
			System.out.println("n2="+n2);
			System.out.println();
			System.out.println("----------");
			System.out.println();
			
			n3=n1;
			n1=n2;
			n2=n3;
			
			System.out.println("n1="+n1);
			System.out.println("n2="+n2);
			
		System.out.println("--------------------------------------------");
		System.out.println("Question-5");
		System.out.println("");
		
			int inputSeconds=17000;    // Input total seconds
			int hours=inputSeconds/3600;
			int reminder=inputSeconds%3600;
			int minutes=reminder/60;
			int seconds=reminder%60;
			
			System.out.println("inputSecond is " + inputSeconds);
			System.out.println(hours + " hours," + minutes + " minutes and " + seconds + " seonds");
			
		System.out.println("--------------------------------------------");
		System.out.println("Question-6");
		System.out.println("");
	
			int caffeinPerDrink=350;    // Input Number of milligrams in 1 drink
			final int  CaffeinToKill=10000;
			int numberOfDrinks = CaffeinToKill/caffeinPerDrink;
			
			System.out.println("Number of milligrams in drink: " + caffeinPerDrink);
			System.out.println("It would take about " + numberOfDrinks + " drinks for a lethal overdose");
			
		System.out.println("--------------------------------------------");
		System.out.println("Question-7");
		System.out.println("");
		
			int priceInCents=35;
			final int inputBalance=100;
			int change=inputBalance-priceInCents;
			int quarters=change/25;
			int reminder1=change%25;
			int dimes=reminder1/10;
			int nicles=reminder1%10/5;
			
			System.out.println("Price in cents : " + priceInCents);
			System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nicles + " nicles" );
						
	}

}
