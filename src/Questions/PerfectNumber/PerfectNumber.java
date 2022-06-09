package Questions.PerfectNumber;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,result=0;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a number :");
		number=scanner.nextInt();
		
		for (int i = 1; i <number; i++) {
			if(number%i==0) {
				result+=i;
			}
		}
		if (number==result) {
			System.out.println(number+" is a perfect number");
		} else {
			System.out.println(number+" is not a perfect number");
		}
	}

}
