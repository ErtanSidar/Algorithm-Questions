package Questions.DigitSum;

import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=0,number;
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Enter a number :");
		number=scanner.nextInt();
		
		while (number!=0) {
			result+=number%10;
			number=number/10;
		}
		
		System.out.println(result);

	}

}
