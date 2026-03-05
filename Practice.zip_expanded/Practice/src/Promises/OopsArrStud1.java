package Promises;
import java.util.*;

class Student1
{
	Scanner s = new Scanner(System.in);
	String name="";
	int id;
	int mrks_M;
	int mrks_P;
	int mrks_C;
	int T_mrks;
	
	void getData()
	{
		System.out.println("ID : ");
		id = s.nextInt();
		s.nextLine();
		System.out.println("Name : ");
		name = s.nextLine();
		System.out.println("mrkM : ");
		mrks_M = s.nextInt();
		System.out.println("mrkP : ");
		mrks_P= s.nextInt();
		System.out.println("mrkC : ");
		mrks_C = s.nextInt();
		T_mrks = mrks_M+mrks_P+mrks_C;
	}
	void display()
	{
		System.out.println("ID : " +id);
		System.out.println("Name : " +name);
		System.out.println("mrkM : " +mrks_M);
		System.out.println("mrkP : " +mrks_P);
		System.out.println("mrkC : " +mrks_C);
		System.out.println("Total Marks : " +T_mrks);
	}
	void tablularDisplay()
	{
		System.out.println(id+ "\t" +name+ "\t" +mrks_M+ "\t" +mrks_P+ "\t" +mrks_C+ "\t" +T_mrks);
	}
	
}

public class OopsArrStud1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n : ");
		int n = sc.nextInt();
		Student1 [] arr = new Student1[n];
		
		for (int i = 0; i< n;i++) {
			arr[i]=new Student1();
			arr[i].getData();
		}
		
		System.out.println("\nId\tname\tmrkM\tmrksP\tmrksC\tmrksT");
		System.out.println("----------------------------------------");
		
//		for (Student1 x:arr) {
//			x.display();
//		}
		
		for (int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i].T_mrks < arr[j].T_mrks) {
					Student1 temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for (Student1 x : arr) {
			x.tablularDisplay();
		}
		sc.close();
	}

}
