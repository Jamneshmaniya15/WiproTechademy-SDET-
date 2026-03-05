package Promises;
import java.util.*;
class Employee
{
	Scanner sc = new Scanner(System.in);
	int empid;
	String empname;
	String designation;
	int salary;
	char grade;
	
	public void getEmployee()
	{
		System.out.print("ID : ");
		empid = sc.nextInt();
		sc.nextLine();
		System.out.print("Name : ");
		empname = sc.nextLine();
		System.out.print("Designatiom : ");
		designation = sc.nextLine();
		System.out.print("Salary : ");
		salary = sc.nextInt();
	}
	
	public void showGrade()
	{
		if(salary>50000) {
			grade = 'A';
		}else if(salary>40000){
			grade = 'B';
		}else if(salary>30000){
			grade = 'C';
		}else if(salary>20000){
			grade = 'D';
		}else if(salary>10000){
			grade = 'E';
		}else {
			grade = 'F';
		}
	}
	
	public void showEmployee()
	{
		System.out.println("ID : " +empid);
		System.out.println("Name : " + empname);
		System.out.println("Designatiom : " +designation);
		System.out.println("Salary : " +salary);
		System.out.println("Grade : " +grade);
	}
}

public class Oopos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		
		e1.getEmployee();
		e1.showGrade();
		e1.showEmployee();
		
		e2.getEmployee();
		e2.showGrade();
		e2.showEmployee();
		
		e3.getEmployee();
		e3.showGrade();
		e3.showEmployee();
	}

}
