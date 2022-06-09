package Questions.DrawStar;

import java.util.Scanner;

public class DrawStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter number of lines :");
		int line=scanner.nextInt();
		
		for (int i = 0; i <line; i++) {
			
			for (int j = 0; j < line-(i+1); j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < 1+(i*2); j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		
		

	}

}
