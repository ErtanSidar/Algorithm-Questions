package Questions.BodyMassIndexCalculator;

import java.util.Scanner;

public class BodyMassIndexCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter your height :");
		double height=scanner.nextDouble();
		
		System.out.println("Eneter your weight :");
		double weight=scanner.nextDouble();
		
		double result=weight/(height*height);
		System.out.println("Your Body Mass Index :"+result);

	}

}
