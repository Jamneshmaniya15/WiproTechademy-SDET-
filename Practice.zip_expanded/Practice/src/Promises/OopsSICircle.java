package Promises;

class Circle3
{
	int r;
	
	 void Acc_r(int r)
	{
		this.r = r;
	}
	 
	 void display(){
		 
	 }
}

class Area extends Circle3
{	
	double a;
	@Override
	void display()
	{
		a=  3.14*r*r;
		System.out.println("Area = " +a);
	}
}

class Volume extends Area
{
	@Override
	void display()
	{
		System.out.println("Volume = " +((4/3)*3.14*r*r*r));
	}
}

public class OopsSICircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volume v = new Volume();
		v.Acc_r(7);
		v.display();
	}

}
