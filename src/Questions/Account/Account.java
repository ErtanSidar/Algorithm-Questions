package Questions.Account;

import java.util.Scanner;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName, password;
        Scanner scanner = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Username :");
            userName = scanner.nextLine();
            System.out.print("Password : ");
            password = scanner.nextLine();

            if (userName.equals("esidar") && password.equals("dev123")) {
                System.out.println("Hello, Welcome to Kodluyoruz Bank Account");
                do {
                    System.out.println("1-Deposit money\n" +
                            "2-Withdraw money\n" +
                            "3-Query balance\n" +
                            "4-Log out");
                    System.out.print("Please select the action you want to do: ");
                    select = scanner.nextInt();
                    switch (select) {
					case 1:
						System.out.print("Amount of money : ");
                        int price = scanner.nextInt();
                        balance += price;
						break;
					
					case 2:
						System.out.print("Amount of money : ");
                        int price1 = scanner.nextInt();
                        if (price1 > balance) {
                            System.out.println("Insufficient balance.");
                        } else {
                            balance -= price1;
                        }
						break;
						
					case 3:
						System.out.println("Your balance : " + balance);
						break;

					default:
						break;
					}
                } while (select != 4);
                System.out.println("See you again.");
                break;
            } else {
                right--;
                System.out.println("Wrong username or password. Try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank.");
                } else {
                    System.out.println("Your Remaining Rights :" + right);
                }
            }
        }
    }

}
