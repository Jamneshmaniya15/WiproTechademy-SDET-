package Promises;

import java.util.Scanner;

public class loops {

	public static void main(Stringa[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		int fact =1;
		System.out.println();
		
		for (int i=1;i<=n;i++) {
			fact = fact*i;
			sum =sum+(1.0/fact);
			System.out.println(sum);
		}
		System.out.println();
		
		double s=0;
		int sign=1;
		for (int i=1;i<=n;i++) {
			s = s+sign*(1.0/i);
			sign = -sign;
			System.out.println(s);
		}
		sc.close();
	}

}
