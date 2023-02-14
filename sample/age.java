package sample;

import java.util.Scanner;

public class age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		
		if(age>18) {
			System.out.println("major");
		} else {
			System.out.println("minor");
		}
	}

}
