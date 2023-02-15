package project.txt;

import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Input number:");
		int day = in.nextInt();
		
		System.out.println(getdayname(day));
	}


	public static String getdayname(int day) {
		String dayname ="";
		switch(day){
		case 1: dayname = "monday"; break;
		case 2: dayname = "tuesday"; break;
		case 3: dayname = "wednesday"; break;
		case 4: dayname = "thursday"; break;
		case 5: dayname = "friday"; break;
		case 6: dayname = "saturday"; break;
		case 7: dayname = "sunday"; break;
		default: dayname = "invalid"; break;
		}
		return dayname;
	}
}
