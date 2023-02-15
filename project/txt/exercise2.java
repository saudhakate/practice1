package project.txt;

import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input num1:");
		int n1 = sc.nextInt();
		System.out.println("Input num2:");
		int n2 = sc.nextInt();
		System.out.println("Input num3:");
		int n3 = sc.nextInt();
		
		if(n1>n2){
			System.out.println("greater number is:"+ n1);
		} else if (n2>n3){
			System.out.println("greater number is:"+n2);
		} else if (n3>n1){
			System.out.println("graeter number is:"+ n3);
		} 
		sc.close();
	}

}
