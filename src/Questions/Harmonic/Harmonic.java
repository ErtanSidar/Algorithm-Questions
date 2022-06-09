package Questions.Harmonic;

import java.util.Scanner;

public class Harmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number; double result=0;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter a number :");
		number=scanner.nextInt();
		
		for (int i = 1; i <=number; i++) {
			result+=1/i;
		}
		System.out.println("Result :"+result);

	}

}
