package Promises;

public class Whileloop2 {

	public static void main(Stringa[] args) {
		// TODO Auto-generated method stub
		int n = 1691;
		int rev = 0;
		
		while(n!=0){
			int digit = n%10;
			rev = rev*10+digit;
			//System.out.print(rev);
			n=n/10;
		}
		
		while(rev!=0) {
			int d = rev%10;
			System.out.print(d+ " ");
			rev = rev/10;
		}
	}

}
