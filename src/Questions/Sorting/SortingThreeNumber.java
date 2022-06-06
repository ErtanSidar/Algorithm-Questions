package Questions.Sorting;

import java.util.Scanner;

public class SortingThreeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Enter Number 1 :");
		a=scanner.nextInt();
		
		System.out.print("Enter Number 2 :");
		b=scanner.nextInt();
		
		System.out.print("Enter Number 3 :");
		c=scanner.nextInt();
		
		if(a>b && a>c) {
			if(b>c) {
				System.out.println("a>b>c");
			}else {
				System.out.println("a>c>b");
			}
		}else if(b>a && b>c) {
			if(a>c) {
				System.out.println("b>a>c");
			}else {
				System.out.println("b>c>a");
			}
		}else if(c>a && c>b) {
			if(a>b) {
				System.out.println("c>a>b");
			}else {
				System.out.println("c>b>a");
			}
		}

	}

}
