package Questions.AdvancedCal;

import java.util.Scanner;

public class AdvancedCal {

	static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many number will you enter :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many number will you enter :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("You cannot enter 0 as a divisor.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter base value :");
        int base = scan.nextInt();
        System.out.print("Enter exponent value :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    }
    
    static void mode() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scan.nextInt();
        
    }
    
    static void rectangular() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = scan.nextInt();
        
    }


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int select;
		String menu = "1- Addition\n" + "2- Extraction\n" + "3- Multiplication\n" + "4- Divide\n"
				+ "5- Exponential Calculation\n" + "6- Factorial Calculation\n" + "7- Mode Retrieval\n"
				+ "8- Rectangular Area and Perimeter Calculation\n" + "0- Log Out";

		do {
			System.out.println(menu);
			System.out.print("Please select an action :");
			select = scan.nextInt();
			switch (select) {
			case 1:
				plus();
				break;
			case 2:
				minus();
				break;
			case 3:
				times();
				break;
			case 4:
				divided();
				break;
			case 5:
				power();
				break;
			case 6:
				factorial();
				break;
			case 7:
				mode();
				break;
			case 8:
				rectangular();
				break;
			case 0:
				break;
			default:
				System.out.println("You entered an incorrect value, try again.");
			}
		} while (select != 0);

	}

}
