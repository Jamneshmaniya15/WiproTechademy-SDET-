package Promises;

public class OopsCallByValue {
	
	static void swap(int a,int b)
	{
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a : "+a+" b : "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		swap(a,b);
		System.out.println("a : "+a+" b : "+b);
	}

}
