package Questions.EvenNumber;

import java.util.Iterator;
import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		int number=scanner.nextInt();
		
		for (int i = 0; i <=number; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}

	}

}
