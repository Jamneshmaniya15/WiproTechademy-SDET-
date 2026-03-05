package Promises;
class Circle1
{
	int rad =0;
	double a =0.0;
	
//	Constructor
//	Circle1(int rad)
//	{
//		this.rad = rad;
//	}
	
//  Deafault Constructor
	Circle1()
	{
		rad =7;
	}
	
//	Copy constuctor
	Circle1(Circle1 c)
	{
		rad = c.rad;
	}

	public void area()
	{
		a = 3.14*rad*rad;
	}
	
	public void display()
	{
		System.out.println(a);
	}
}

public class oops4 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//Normal constructor
//		Circle1 c1 = new Circle1(7);
//		c1.area();
//		c1.display();
		
//		Deafualt constuctor
		Circle1 c1 = new Circle1();
		c1.area();
		c1.display();
	
//		Copy Constuctor
		Circle1 c2 = new Circle1();
		c2.area();
		c2.display();
	}

}
