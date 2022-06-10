package Questions.RecursiveExp;

import java.util.Scanner;

public class RecursiveExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base,exp;
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter base value :");
		base=scanner.nextInt();
		
		System.out.print("Enter exponent value :");
		exp=scanner.nextInt();
		
		System.out.println("Result :"+exponent(base,exp));
		

	}
	
	public static int exponent(int base,int exp) {
		if(exp==0) {
			return 1;
		}else {
			return base*exponent(base,exp-1);
		}
	}

}
