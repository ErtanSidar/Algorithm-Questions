package Questions.Temperature;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Enter Temperature :");
		int temperature =scanner.nextInt();
		
		if(temperature < 5) {
			System.out.println("you can ski");
		}else if(temperature >5 && temperature<15){
			System.out.println("you can go to the cinema");
		}else if(temperature>15 && temperature<25) {
			System.out.println("you can go to the picnic");
		}else {
			System.out.println("you can go swimming");
		}
		
		

	}

}
