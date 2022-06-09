package Questions.EbobEkok;

import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2,ebob=0,ekok;
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Enter number 1 :");
		number1=scanner.nextInt();
		
		System.out.print("Enter number 2 :");
		number2=scanner.nextInt();
		
		for (int i = 1; i < number1/2; i++) {
			if(number1%i==0 && number2%i==0) {
				ebob=i;
			}
		}
		
		System.out.println("Ebob :"+ebob);
		System.out.println("Ekok :"+(number1*number2/ebob));
		

	}

}
