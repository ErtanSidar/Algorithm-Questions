package Questions.Calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1, number2, selected;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Enter number 1 :");
		number1=scanner.nextInt();
		
		System.out.print("Enter number 2 :");
		number2=scanner.nextInt();
		
		System.out.println("1-Addition\n2-Extraction\n3-Multiplication\n4-Division");
		System.out.print("Enter your choice :");
		selected=scanner.nextInt();
		
		switch (selected) {
		case 1:
			System.out.println("Addition :"+(number1+number2));
			break;
			
		case 2:
			System.out.println("Extraction :"+(number1-number2));
			break;
			
		case 3:
			System.out.println("Multilication :"+(number1*number2));
			break;
	
		case 4:
			System.out.println("Division :"+(number1/number2));
			break;
		default:
			System.out.println("invalid choice");
			break;
		}
	}

}
