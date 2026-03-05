package Promises;

public class Armstrong {

	public static void main(Stringa[] args) {
		// TODO Auto-generated method stub
		int n = 153;
		int temp = n;
		int sum = 0;
		int digit;
		int count = 0;
		
		while(temp!=0) {
			count++;
			temp/=10;
		}
		
		temp = n;
		while(temp!=0) {
			digit = temp%10;
			int pro = 1;
			
			for (int i=1;i<=count;i++) {
				pro *=digit;
			}
			sum =sum+pro;
			temp/=10;
		}
		
		
		if(sum == n){
			System.out.println("Armstrong no.");
		}

	}

}
