package Promises;

class Circle2
{
	int rad;
	
	Circle2(int rad){
		this.rad = rad;
	}
	
	
}

public class OopsPassingobject {
	
	public static void display(Circle2 c)
	{
		System.out.println("Area : " +(3.14*c.rad*c.rad));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle2 c1 = new Circle2(4);
		display(c1);
	}

}
