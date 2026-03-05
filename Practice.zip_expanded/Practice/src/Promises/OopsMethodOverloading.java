package Promises;

class Data1
{
	int r;
	int l;
	int b;
	
	Data1(int r, int l,int b){
		this.r = r;
		this.l = l;
		this.b =b;
	}
}

class Circle5 extends Data1
{
	Circle5(int r,int l,int b){
		super(r,l,b);
	}
	
	void display() {
		System.out.println("Area : " +(3.14*r*r));
	}
}

class Cylinder extends Data1
{
	Cylinder(int r, int l, int b){
		super(r,l,b);
	}
	
	void display() {
		System.out.println("Area : " +(3.14*r*r));
	}
}

class Cube extends Data1
{
	Cube(int r, int l, int b){
		super(r,l,b);
	}
	
	void display() {
		System.out.println("Area : " +(l*l*l));
	}
}


class Cuboid extends Data1
{
	Cuboid(int r, int l, int b){
		super(r,l,b);
	}
	
	void display() {
		System.out.println("Area : " +(b*r*l));
	}
}

class Triangle4 extends Data1
{
	Triangle4(int r,int l,int b){
		super(r,l,b);
	}
	void display() {
		System.out.println("Area : " +(0.5*l*b));
	}
}

class Rectangle extends Data1
{
	Rectangle(int r,int l,int b){
		super(r,l,b);
	}
	void display() {
		System.out.println("Area : " +(l*b));
	}
}

public class OopsMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(0,2,5);
		Triangle4 t = new Triangle4(0,4,5);
		Circle5 c = new Circle5(4,0,0);
		Cube cu = new Cube(0,2,0);
		Cuboid cb = new Cuboid(2,3,4);
		Cylinder cy = new Cylinder(4,3,0);
		
		
		r.display();
		t.display();
		c.display();
		cu.display();
		cb.display();
		cy.display();
		

	}

}
