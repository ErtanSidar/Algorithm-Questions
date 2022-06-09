package Questions.Combination;

import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,r,result;
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter N :");
		n=scanner.nextInt();
		
		System.out.print("Enter R :");
		r=scanner.nextInt();
		
		result=factorial(n)/(factorial(r)*factorial(n-r));
		
		System.out.println(result);

	}
	
	public static int factorial(int number) {
		int result=1;
		for(int i=1;i<=number;i++) {
			result*=i;
		}
		return result;
	}

}
