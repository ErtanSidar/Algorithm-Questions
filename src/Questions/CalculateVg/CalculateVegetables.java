package Questions.CalculateVg;

import java.util.Scanner;

public class CalculateVegetables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pear=2.14;
		double apple=3.67;
		double tomatoes=1.11;
		double banana=0.95;
		double aubergine=5.0;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Enter pear kilos :");
		double pearKilo=scanner.nextDouble();
		
		System.out.print("Enter apple kilos :");
		double appleKilo=scanner.nextDouble();
		
		System.out.print("Enter tomatoes kilos :");
		double tomatoesKilo=scanner.nextDouble();
		
		System.out.print("Enter banana kilos :");
		double bananaKilo=scanner.nextDouble();
		
		System.out.print("Enter aubergine kilos :");
		double aubergineKilo=scanner.nextDouble();
		
		double result=pear*pearKilo+apple*appleKilo+tomatoes*tomatoesKilo+banana*bananaKilo+aubergine*aubergineKilo;
		System.out.println("Total Price :"+result);
	}

}
