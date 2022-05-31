package Questions.Validation;

import java.util.Scanner;

public class UserValidation {
	
	static Scanner scanner= new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myUserName="Ertan", myPassword="Java", userName, password;
		
		
		
		System.out.print("Enter your username :");
		userName=scanner.nextLine();
		
		System.out.print("Enter your password :");
		password=scanner.nextLine();
		
		if (userName.equals(myUserName) && password.equals(myPassword)) {
			System.out.println("Login Success.");
		} else {
			System.out.println("username or password incorrect");
			System.out.println("Do you want to change your password? (yes or no)");
			String selected=scanner.nextLine();
			changeInfo(selected,userName,password);
		}
		

	}
	public static void changeInfo(String select,String userName, String password) {
		if(select.equals("yes")) {
			System.out.print("Enter new UserName :");
			userName=scanner.nextLine();
			
			System.out.print("Enter new password :");
			password=scanner.nextLine();
			
			
		}else {
			System.out.println("Your choice is no. ");
		}
	}

}
