package project.txt;

import java.util.Scanner;

public class exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input a: ");
		double a = in.nextDouble();
		System.out.println("Input b: ");
		double b = in.nextDouble();
		System.out.println("Input c: ");
		double c = in.nextDouble();
		
		double result=b*b-4.0*a*c;
		
		if(result>0.0) {
			double r1= (-b + Math.pow(result, 0.5))/(2.0*a);
			double r2= (-b - Math.pow(result, 0.5))/(2.0*a);
			System.out.println("the root is"+r1+"and"+r2);
		} else if (result==0.0) {
			double r1 = -b/(2.0*a);
			System.out.println("the root is"+ r1);
		} else {
			System.out.println("The equation has no real root");
	}

}
}
