package Promises;
import java.util.*;
class Employee1
{
	Scanner sc = new Scanner(System.in);
	int id;
	String name;
	String des;
	int sal;
	
	void getEmployee()
	{
		System.out.print("ID : ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("Name : ");
		name = sc.nextLine();
		System.out.print("Designatiom : ");
		des = sc.nextLine();
		System.out.print("Salary : ");
		sal = sc.nextInt();
	}
	
	void showEmployee()
	{
		System.out.println(id+ "\t" +name+ "\t" +des+ "\t" +sal);
	}
}

public class OopsArrEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		Employee1 [] arr = new Employee1[n];
		
		for (int i= 0;i<n;i++) {
			arr[i]= new Employee1();
			arr[i].getEmployee();
		}
		
		System.out.println("\nid\tname\tdes\tsal");
		System.out.println("--------------------");
		
		for(int i =0 ; i< n-1 ;i++) {
			for (int j =i+1;j<n;j++) {
				if(arr[i].sal > arr[j].sal) {
					Employee1 temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(Employee1 x : arr) {
			x.showEmployee();
		}
		s.close();

	}

}
