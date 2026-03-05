package Promises;

public class ifelse2 {

	public static void main(Stringa[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		int count=0;
		int temp = n;
		
		while(temp!=0) {
			count++;
			temp/=10;
		}
		
		System.out.println(count);
		
		if (n%4==0) {
			System.out.println("Leap year");
		}else {
			System.out.println("Normal Year");
		}
	}

}
