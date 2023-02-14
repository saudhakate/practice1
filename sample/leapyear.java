package sample;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the year: ");
		int year = sc.nextInt();
		
		if(year%2==0) {
			System.out.println(year + "is a leap year");
		}else {
			System.out.println(year + "is an not leap year");
		}
	}

}
