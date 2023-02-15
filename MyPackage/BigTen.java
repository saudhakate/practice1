package MyPackage;

import java.util.Scanner;

public class BigTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n,i=1,big=0;
        while(i<=10){
            System.out.println("Enter a number:");
            n=sc.nextInt();
            if(n>big)
            big=n;
            i++;
        }
        sc.close();
        System.out.println("big:"+big);
	}

}
