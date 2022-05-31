package Questions.TaximeterProgram;

import java.util.Scanner;

public class TaximeterProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price=2.20;
		
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter Km :");
		double km=scanner.nextDouble();
		
		double result=km*price+10;
		
		if(result<20) {
			System.out.println("Total price :"+20);
		}else {
			System.out.println("Total price :"+result);
		}
		
		
		

	}

}
