package Promises;



class Circl{
	void gcd(int a ,int b) {
		while (b!=0) {
			int temp = b;
			b =a%b;
			a = temp;
		}
		System.out.println(a);
	}
}

public class OOPSprac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circl c = new Circl();
		c.gcd(48, 18);
		
	}

}
