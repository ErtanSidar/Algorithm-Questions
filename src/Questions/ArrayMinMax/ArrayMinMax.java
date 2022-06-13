package Questions.ArrayMinMax;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int min=0,max=0,number;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number :");
		number=scanner.nextInt();

		int[] list = {15,12,788,1,-1,2,0};

		Arrays.sort(list);

		for (int i : list) {
			if (i < number) {
				min = i;
			}
		}
		
		for (int i : list) {
			if (i > number) {
				max = i;
				break;
			}
		}

		System.out.println("Minimum " + min);
		System.out.println("Maximum " + max);

	}

}
