package Promises;

interface Area1
{
	void display();
}

class Radius
{
	int r;
	Radius(int r)
	{
		this.r = r;
	}
}

class Sphere extends Radius implements Area1
{
	double a;
	Sphere(int r)
	
	{
		super(r);
	}
	
	public void display()
	{
		a = (4/3)*3.14*r*r*r;
		System.out.println("area of shere : " +a);
	}
}

class Hemisphere extends Sphere implements Area1
{
	Hemisphere(int r)
	{
		super(r);
	}
	
	public void display()
	{
		super.display();
		System.out.println(a/2);
	}
}

public class OopsVolSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hemisphere h = new Hemisphere(7);
		h.display();

	}

}
