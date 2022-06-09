package Questions.MinMax;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tmp,howMany,min=0,max=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("How many numbers will you enter? :");
		howMany=scanner.nextInt();
		
		for (int i = 0; i <howMany; i++) {
			System.out.print("Enter Number "+(i+1)+" :");
			tmp=scanner.nextInt();
			if(min>tmp) {
				min=tmp;
			}
			if(max<tmp) {
				max=tmp;
			}
		}
		System.out.println("Max :"+max);
		System.out.println("Min :"+min);

	}

}
