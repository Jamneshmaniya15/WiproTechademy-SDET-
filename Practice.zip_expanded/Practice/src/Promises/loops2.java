package Promises;

public class loops2 {

	public static void main(Stringa[] args) {
		// TODO Auto-generated method stub
		int n = 1872,sum =0,rev =0;
		
		while(n!=0) {
			int digit = n%10;
			rev = rev *10+digit;
			n=n/10;
		}
		
		while(rev!=0) {
			int d = rev%10;
			sum = sum +(d*d*d);
			
			rev/=10;
		}
		System.out.println(sum);
	}

}
