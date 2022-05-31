package Questions.VatCalculator;

import java.util.Scanner;

public class VATCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);		
		
		System.out.print("Enter number");
		double money=scanner.nextDouble();
		
		System.out.println("Normal price :"+money);
		
		if(money>0 && money<1000) {
			System.out.println("VAT price :"+(money+((money*18)/100)));
		}else {
			System.out.println("VAT price :"+(money+((money*8)/100)));
		}
	}

}
