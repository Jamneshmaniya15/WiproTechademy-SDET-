package Promises;

class Staff
{
	int code;
	String name;
}

class Teacher extends Staff
{
	String sub;
	int exp;
}

class Typist extends Staff
{
	String Speed;
	int exp;
}

class Officer extends Staff
{
	char grade;
	String dep;
}

class Regular extends Typist
{
	int sal;
}

class Casual extends Typist
{
	int wages;
}

public class OopsInheritence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
