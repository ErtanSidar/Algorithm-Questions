package Questions.Horoscope;

import java.util.Scanner;

public class Horoscope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month,day;
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Enter Day :");
		day=scanner.nextInt();
		
		System.out.print("Enter Month :");
		month=scanner.nextInt();
		
		if(month==1) {
			if(day>=1 && day<=21) {
				System.out.println("Capricorn");
			}else {
				System.out.println("");
			}
		}else if(month==2) {
			if(day>=1 && day<=19) {
				System.out.println("Aquarius");
			}else {
				System.out.println("Pisces");
			}
		}else if(month==3) {
			if(day>=1 && day<=20) {
				System.out.println("Pisces");
			}else {
				System.out.println("Aries");
			}
		}else if(month==4) {
			if(day>=1 && day<=20) {
				System.out.println("Aries");
			}else {
				System.out.println("Taurus");
			}
		}else if(month==5) {
			if(day>=1 && day<=21) {
				System.out.println("Taurus");
			}else {
				System.out.println("Gemini");
			}
		}else if(month==6) {
			if(day>=1 && day<=22) {
				System.out.println("Gemini");
			}else {
				System.out.println("Cancer");
			}
		}else if(month==7) {
			if(day>=1 && day<=22) {
				System.out.println("Cancer");
			}else {
				System.out.println("Leo");
			}
		}else if(month==8) {
			if(day>=1 && day<=22) {
				System.out.println("Leo");
			}else {
				System.out.println("virgo");
			}
		}else if(month==9) {
			if(day>=1 && day<=22) {
				System.out.println("virgo");
			}else {
				System.out.println("Libra");
			}
		}else if(month==10) {
			if(day>=1 && day<=22) {
				System.out.println("Libra");
			}else {
				System.out.println("Scorpio");
			}
		}else if(month==11) {
			if(day>=1 && day<=21) {
				System.out.println("Scorpio");
			}else {
				System.out.println("Sagittarius");
			}
		}else if(month==12) {
			if(day>=1 && day<=21) {
				System.out.println("Sagittarius");
			}else {
				System.out.println("Capricorn");
			}
		}else {
			System.out.println("invalid transaction");
		}
		

	}

}
