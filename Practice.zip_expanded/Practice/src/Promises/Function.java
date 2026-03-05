package Promises;


public class Function{
	public static void Prime(int n)
	{
		boolean isPrime = true;
		
		if(n<=0) {
			isPrime=false;
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println("Prime");
		}else
		{
			System.out.println("notPrime");
		}
	}
	
	public static void EorO(int n)
	{
		if(n%2==0)
		{
			System.out.println("Even");
		}else
		{
			System.out.println("odd");
		}
	}
	
	public static void Table(int n)
	{
		for(int i=1;i<=10;i++) {
			System.out.println(n*i); 
		}
	}
	
	public static int Add(int a,int n)
	{
		return a+n;
	}
	
	public static int Factorial(int b)
	{
		int fact = 1;
		for(int i =1;i<=b;i++)
		{
			fact*=i;
		}
		return fact;
	}
	
	public static int Sumof(int n)
	{
		while(n==0) {
			return 0;
		}
		return n+Sumof(n-1);
	}
	
	public static int fibb(int n)
	{
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return fibb(n-1) + fibb(n-2);
	}
	
	public static void main(Stringa[] args) {
		// TODO Auto-generated method stub
		
		int n = 11;
		int a =3;
		Prime(n);
		EorO(n);
		System.out.println();
		Table(n);
		System.out.println();
		int res = Add(a,n);
		System.out.println(res);
		int z = Factorial(a)*Factorial(n-a);
		System.out.println(Factorial(n)/z);
		System.out.println();
		System.out.println(Sumof(n));
		System.out.println();
		System.out.println(fibb(n));
		
		
		
		
		
	}
	
}
