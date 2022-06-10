package Questions.Palindrome;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tmp="",newString;
		
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter a number :");
		int number=scanner.nextInt();
		
		newString=Integer.toString(number);
		
		for (int i = 0; i < newString.length(); i++) {
			tmp=newString.charAt(i)+tmp;
		}
		if(tmp.equals(newString)) {
			System.out.println(newString+" is a polindrome");
		}else {
			System.out.println(newString+" is not a polindrome");
		}
		

	}

}
