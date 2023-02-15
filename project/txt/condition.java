package project.txt;

import java.util.Scanner;

public class condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(0<a) {
			System.out.println("Positive");
		} else {
			System.out.println("Negative");
		}
	}

}
