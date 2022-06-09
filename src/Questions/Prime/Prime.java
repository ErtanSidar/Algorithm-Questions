package Questions.Prime;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 2; i <100; i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}

	}
	
	public static boolean isPrime(int number) {
		int tmp=0;
		for (int i = 2; i < number; i++) {
			if(number%i==0) {
				tmp++;
			}
		}
		if(tmp==0) {
			return true;
		}else 
			return false;
	}

}
