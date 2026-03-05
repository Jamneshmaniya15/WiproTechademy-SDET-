package Promises;
import java.util.*;
class Circle
{
	Scanner sc = new Scanner(System.in);
	int rad =0;
	double a =0.0;
	
	public void radius()
	{
		rad = sc.nextInt();
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

public class OOPS1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.radius();
		c1.area();
		c1.display();
	}

}
