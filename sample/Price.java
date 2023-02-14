package sample;

import java.util.Scanner;

public class Price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Item number: ");
		int num = sc.nextInt();
		System.out.println("Item name: ");
		String name = sc.next();
		System.out.println("rate: ");
		double rate = sc.nextDouble();
		System.out.println("quantity: ");
		float qty = sc.nextFloat();
		
		double result = (rate*qty);
		System.out.println("price is" + result);
		
	}

}
