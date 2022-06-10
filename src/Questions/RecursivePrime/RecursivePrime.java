package Questions.RecursivePrime;

import java.util.Scanner;

public class RecursivePrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        n = scanner.nextInt();
		
	    if (isPrime(n, 2))
	    	System.out.println(n+" is a prime number");
	    else
	    	System.out.println(n+" is not a prime number");

	}
	
	static boolean isPrime(int n,int i) {
		if (n <= 2)
            return (n == 2) ? true : false;
        if (n % i == 0)
            return false;
        if (i * i > n)
            return true;
        // Check for next divisor
        return isPrime(n, i + 1);
	}

}
