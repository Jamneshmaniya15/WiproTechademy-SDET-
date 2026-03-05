package Promises;

public class Whileloop {

	public static void main(Stringa[] args) {
		// TODO Auto-generated method stub
		int n=55768798 ;
		int rev=0;
			while(n!=0) {
				int digit = n%10;
				rev = rev*10+digit;
				n/=10;
				
			}
System.out.println(rev);
	}
	}
	


