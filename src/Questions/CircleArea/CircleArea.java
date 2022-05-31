package Questions.CircleArea;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter r :");
		int r=scanner.nextInt();
		
		System.out.print("Enter a :");
		int a=scanner.nextInt();
		
		double area=Math.PI*Math.pow(r, 2);
		System.out.println(area);
		
		double primeter=2*Math.PI*r;
		System.out.println(primeter);
		
		double result=(Math.PI*r*r*a)/360;

	}

}
