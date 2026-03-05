package Promises;

import java.util.Scanner;

public class fibb {

	public static void main(Stringa[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0;
		int b=1;
		for(int i=1;i<=n;i++) {
			System.out.println(a);
			int nxt =a+b;
			b=a;
			a=nxt;	
		}
		sc.close();
	}

}
