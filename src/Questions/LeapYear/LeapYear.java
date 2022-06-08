package Questions.LeapYear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter date :");
		int date=scanner.nextInt();
		if(date%4==0 && date!=1700 && date!=1800 && date!= 1900) {
			System.out.println("This year is leap year.");
		}else {
			System.out.println("This year is not leap year.");
		}

	}

}
