package MyPackage;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		if(n>15) {
			System.out.println("Positive");
		} else if (n<15){
			System.out.println("Negative");
		} else {
			System.out.println("Zero");
		}
	}

}
