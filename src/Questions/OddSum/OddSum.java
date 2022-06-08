package Questions.OddSum;

import java.util.Scanner;

public class OddSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int number,total=0;
		
		System.out.print("Enter a number :");
		number=scanner.nextInt();
		
		for (int i = 0; i <=number; i++) {
			if(i%2!=0) {
				total+=i;
			}
		}
		System.out.println("Total :"+total);
	}

}
