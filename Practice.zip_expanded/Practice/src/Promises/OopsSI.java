package Promises;

class Accept
{
	int a;
	int b;
	void accept(int a,int b){
		this.a=a;
		this.b=b;
	}
}

class Add extends Accept
{
	void adding() {
	System.out.println(a+b);
	}
}

public class OopsSI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a = new Add();
		a.accept(12,13);
		a.adding();
	}

}
