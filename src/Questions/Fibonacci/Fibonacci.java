package Questions.Fibonacci;

import java.util.Iterator;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1=0,number2=1,tmp;
		
		System.out.print(number1+" ");
		System.out.print(number2+" ");
		
		for (int i = 0; i < 9; i++) {
			tmp=number1+number2;
			number1=number2;
			number2=tmp;
			System.out.print(tmp+" ");
		}

	}

}
