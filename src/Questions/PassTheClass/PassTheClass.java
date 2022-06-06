package Questions.PassTheClass;

import java.util.Scanner;

public class PassTheClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Your Math Grade :");
		int math=scanner.nextInt();
		
		System.out.print("Enter Your Physics Grade : ");
		int physics=scanner.nextInt();
		
		System.out.print("Enter Your Turkish Grade :");
		int turkish=scanner.nextInt();
		
		System.out.print("Enter Your Chemical Grade :");
		int chemical=scanner.nextInt();
		
		System.out.println("Enter Your Music Grade :");
		int music=scanner.nextInt();
		
		int average=(math+physics+turkish+chemical+music)/5;
		
		if(average<50) {
			System.out.println("you failed the class");
		}else {
			System.out.println("You success the class");
		}

	}

}
