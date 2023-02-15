package MyPackage;

import java.util.Scanner;

public class SmallThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n1=sc.nextInt();
		System.out.println("Enter second number:");
		int n2=sc.nextInt();
		System.out.println("Enter third number:");
		int n3= sc.nextInt();
		
		if(n1<n2&&n1<n3) {
			System.out.println("small: "+n1);
		}else if(n2<n3) {
			System.out.println("small: "+n2);
		}else {
			System.out.println("small: "+n3);
		}
		sc.close();
	}

}
