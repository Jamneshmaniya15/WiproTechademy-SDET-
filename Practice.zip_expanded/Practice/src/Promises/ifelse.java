package Promises;

public class ifelse {

	public static void main(Stringa[] args) {
		// TODO Auto-generated method stub
		int n = 10, count = 0;

		for (int a = 2; count < n; a++) {
		    boolean prime = true;

		    for (int i = 2; i <= a / 2; i++) {
		        if (a % i == 0) {
		            prime = false;
		            break;
		        }
		    }

		    if (prime) {
		        System.out.println(a);
		        count++;
		    }
		}

	}

}

//package Promises;
//
//public class Practise {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		int n = 12;
//		int num =2;
//		int count = 0;
//		
//		while(count<n) {
//			boolean isPrime = true;	
//			for(int i = 2;i*i<=num;i++) {
//				if(num%i==0) {
//					isPrime = false;
//					break;
//				}
//			}
//			
//			if(isPrime) {
//				System.out.println(num);
//				count++;
//			}
//			
//			num++;
//		}
//		
//		
//		
//	}
//
//}