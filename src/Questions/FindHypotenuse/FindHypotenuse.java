package Questions.FindHypotenuse;

import java.util.Scanner;

public class FindHypotenuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Enter edge a :");
		int a= scanner.nextInt();
		
		System.out.print("Enter edge b :");
		int b= scanner.nextInt();
		
		int tmp=a*a+b*b;
		int c=(int) Math.sqrt(tmp);
		
		int u=(a+b+c)/2;
		
		int perimeterOfTriangle=2*u;
		
		System.out.println(perimeterOfTriangle);
	}

}
