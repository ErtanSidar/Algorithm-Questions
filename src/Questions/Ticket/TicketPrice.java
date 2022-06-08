package Questions.Ticket;

import java.util.Scanner;

public class TicketPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int km,age,flightType;
		double kmPrice=0.10, result;
		
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter Km :");
		km=scanner.nextInt();
		
		System.out.print("Enter Age :");
		age=scanner.nextInt();
		
		System.out.print("Enter flight type(1 or 2) :");
		flightType=scanner.nextInt();
		
		if((km>0 && age>0) && (flightType==1 || flightType==2)) {
			if(age<12) {
				result=km*kmPrice;
				System.out.println("Normal price :"+result);
				System.out.println("Age Discount price :"+(result-(result*0.10)));
				System.out.println("Discounted price :"+result*0.5);
			
			}
		}else {
			System.out.println("Invalid input");
		}
	}

}
