package Promises;
import java.util.Scanner;

abstract class B{
	
	abstract void area();
}

class Cir extends B{
	double r;
	Cir(double r){
		this.r = r;
	}
	@Override
	void area() {
		System.out.println(Math.PI*r*r);
	}
}

class Rec extends B{
	int l;
	int b;
	
	Rec(int l,int b){
		this.l = l;
		this.b = b;
	}
	@Override
	void area() {
		System.out.println(l*b);
	}
}

class Tri extends B{
	int l;
	int b;
	
	Tri(int l,int b){
		this.l = l;
		this.b = b;
	}
	@Override
	void area() {
		System.out.println(0.5*l*b);
	}
}

class Sqr extends B{
	int x;
	
	Sqr(int x){
		this.x = x;
	}
	
	@Override
	void area() {
		System.out.println(x*x);
	}
}

public class OOPSPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Tri a = new Tri(3,5);
		a.area();
		
		Rec r = new Rec(4,5);
		r.area();
		
		Cir c = new Cir(5);
		c.area();

		Sqr s = new Sqr(6);
		s.area();
		sc.close();
	}

}
