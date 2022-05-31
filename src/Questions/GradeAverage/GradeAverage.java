package Questions.GradeAverage;

import java.util.Scanner;

public class GradeAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Enter your math grade :");
		int math=scanner.nextInt();
		
		System.out.print("Enter your physics grade :");
		int physics=scanner.nextInt();
		
		System.out.print("Enter your turkish grade :");
		int turkish=scanner.nextInt();
		
		System.out.print("Enter your history grade :");
		int history=scanner.nextInt();
		
		System.out.print("Enter your music grade :");
		int music=scanner.nextInt();
		
		int sum=math+physics+turkish+history+music;
		int average=sum/5;
		
		System.out.println("Average :"+average);

	}

}
