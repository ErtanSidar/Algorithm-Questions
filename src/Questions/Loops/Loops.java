package Questions.Loops;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int number =scanner.nextInt();
		
		for(int i=0;i<=number;i++) {
			if(i%20==0) {
				System.out.print(i+" ");
			}
		}

	}

}
