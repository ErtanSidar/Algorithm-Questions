package Questions.Exponentiation;

import java.util.Scanner;

public class Exponentiation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base,exponent,result=1;
		
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter base :");
		base=scanner.nextInt();
		
		System.out.print("Enter exponent");
		exponent=scanner.nextInt();
		
		for (int i = 0; i <exponent; i++) {
			result*=base;
		}
		
		System.out.println("Result :"+result);
		
		

	}

}
