package Promises;

abstract class Base
{
	int r;
	int l;
	int b;
	
	Base(int r,int l,int b){
		this.r=r;
		this.l=l;
		this.b=b;
	}
	
	abstract void display();
		
	
}

class Circle4 extends Base
{
	Circle4(int r,int l,int b){
		super(r,l,b);
	}
	
	void display() {
		System.out.println("Area of circle : " +(3.14*r*r));
	}
}

class Rect extends Base
{
	Rect(int r,int l,int b){
		super(r,l,b);
	}
	
	void display() {
		System.out.println("Area od rect : " +(l*b));
	}
}

class Triangle extends Base
{
	Triangle(int r, int l,int b)
	{
		super(r,l,b);
	}
	
	void display() {
		System.out.println("Area od rect : " +(0.5*l*b));
	}
}

public class OopsArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle t1 = new Triangle(1,2,3);
		t1.display();
		
		Rect r1 = new Rect(1,2,3);
		r1.display();
		
		Circle4 c1 = new Circle4(1,2,3);
		c1.display();

	}

}
