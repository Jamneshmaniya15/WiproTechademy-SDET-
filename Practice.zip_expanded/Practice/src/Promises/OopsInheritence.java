package Promises;

class Person
{
	String name;
	
	void getName(String name)
	{
		this.name=name;
	}
}

class Account extends Person
{
	int accNo;
	
	void getAccNo(int accNo)
	{
		this.accNo=accNo;
	}
}

class Admin extends Account
{
	void display()
	{
		System.out.println(name);
		System.out.println(accNo);
	}
}

public class OopsInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin a = new Admin();
		a.getName("Pokemon");
		a.getAccNo(23847);
		a.display();

	}

}
