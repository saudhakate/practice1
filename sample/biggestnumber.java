package sample;

import java.util.Scanner;

public class biggestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the 2nd number: ");
		int n2 = sc.nextInt();
		System.out.println("Enter the 3rd number: ");
		int n3 = sc.nextInt();
		
		if(n1>n2) {
			System.out.println("big" + n1);
		} else if (n2>n3) {
			System.out.println("big" + n2);
		} else if (n3>n1) {
			System.out.println("big" + n3);
		}
	}

}
