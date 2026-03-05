package Promises;

class Test1
{
	int a;
	
	Test1(int a)
	{
		this.a=a;
	}
}

public class OopsCompareGreater {
	
	static Test1 greater(Test1 t1,Test1 t2)
	{
		if (t1.a>t2.a) {
			return t1;
		}else {
			return t2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1(43);
		Test1 t2 = new Test1(32);
		
		Test1 res = greater(t1,t2);
		System.out.println(res.a);
	}
	
	
}
