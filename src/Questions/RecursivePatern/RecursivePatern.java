package Questions.RecursivePatern;

import java.util.Scanner;

public class RecursivePatern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter a number : ");
        int number = scanner.nextInt();
        
		positive(negative(number),number);

	}
	
	 static int negative(int x) {
	        if (x <= 0){
	            return x;
	        }
	        else {
	            System.out.print(x + " ");
	            return negative(x-5);
	        }
	    }

	    static int positive(int x,int y) {
	        if(x > y){
	            return x;
	        }
	        else {
	            System.out.print(x + " ");
	            return positive(x+5,y);
	        }

	    }

}
