package Promises;

class Test
{
	static int count=0;
	
	Test()
	{
		count++;
	}
	
	public static void showCount()
	{
		System.out.println(count);
	}
}

public class OopsCountObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Test t1 = new Test();
//		Test t2 = new Test();
//		Test t3 = new Test();
//		Test t4 = new Test();
//		Test t5 = new Test();
		Test.showCount();
	}

}
