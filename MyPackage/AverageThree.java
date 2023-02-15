package MyPackage;

import java.util.Scanner;

public class AverageThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n1=sc.nextInt();
		System.out.println("Enter second number:");
		int n2=sc.nextInt();
		System.out.println("Enter second number:");
		int n3=sc.nextInt();
		
		int values = n1+n2+n3;
		System.out.println("value: "+values);
		int result = values/3;
		System.out.println("result: "+result); System.exit(result);
	}

}
