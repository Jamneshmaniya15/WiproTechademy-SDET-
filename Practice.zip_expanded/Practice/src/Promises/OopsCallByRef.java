package Promises;

class Pair
{
	int a;
	int b;
}

public class OopsCallByRef {
	
	static void swap(Pair p)
	{
		int temp = p.a;
		p.a = p.b;
		p.b = temp;
		System.out.println("a : "+p.a+" b : "+p.b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pair p1 = new Pair();
		p1.a = 10;
		p1.b = 20;
		swap(p1);
		System.out.println("a : "+p1.a+" b : "+p1.b);
	}

}
