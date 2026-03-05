package Promises;

class Parent
{
	int a;
	Parent(int a)
	{
		this.a=a;
	}
	
	void display()
	{
		System.out.println("A : " +a);
	}
}

class Child extends Parent
{
	int b;
	Child(int a,int b){
		super(a);
		this.b = b;
	}
	
	void display(int c) {
		System.out.println("A : "+a);
		System.out.println("B : "+b);
		System.out.println("C : "+c);
	}
}

public class Oops5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child(3,5);
		c.display();
		c.display(34);
		

	}

}
