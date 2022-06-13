package Questions.ArraySorting;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,number;
		
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter array size :");
		size=scanner.nextInt();
		
		int arr[] = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the "+(i+1)+". element of array :");
			number=scanner.nextInt();
			arr[i]=number;
		}
		Arrays.sort(arr);
		for(int i:arr) {
			System.out.println(i);
		}

	}

}
