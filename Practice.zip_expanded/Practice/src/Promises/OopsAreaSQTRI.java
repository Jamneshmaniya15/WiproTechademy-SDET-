package Promises;

abstract class Data
{
	int l;
	int b;
	
	Data(int l,int b){
	this.l=l;
	this.b=b;
	}
	
	abstract void Area();
}

class Square extends Data
{
	Square(int l,int b){
		super(l,b);
	}
	
	void Area() {
		System.out.println("Area of sqr : " +(l*l));
	}
}

class Triangle2 extends Data
{
	Triangle2(int l,int b){
		super(l,b);
	}
	void Area() {
		System.out.println("Area of tri : " +(0.5*l*b));
	}
}




public class OopsAreaSQTRI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square(2,4);
		s.Area();
		
		Triangle2 t = new Triangle2(3,5);
		t.Area();

	}

}
