package Promises;

class Student
{
	int id;
	String name;
	int mrkM;
	int mrkP;
	int mrkC;
	
	Student(int id,String name,int mrkM,int mrkP,int mrkC){
		this.id= id;
		this.name= name;
		this.mrkM= mrkM;
		this.mrkP= mrkP;
		this.mrkC= mrkC;
	}
	
	public void display()
	{
		System.out.println("ID : " +id);
		System.out.println("Name : " +name);
		System.out.println("mrkM : " +mrkM);
		System.out.println("mrkP : " +mrkP);
		System.out.println("mrkC : " +mrkC);
	}
}

public class Oops3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(1,"Jadu",76,45,78);
		s.display();
	}

}
