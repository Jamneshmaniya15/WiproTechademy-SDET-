package JamneshManiya;
import java.util.*;
public class StudentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Student Name : ");
		String S_name = sc.nextLine();
		System.out.print("English Marks : ");
		int mks_e = sc.nextInt();
		System.out.print("Math Marks : ");
		int mks_m = sc.nextInt();
		int total = mks_e + mks_m;
		float per = total*100f/200;
		
		if (per >= 90) {
			System.out.println("Student : " +S_name);
			System.out.println("English : " +mks_e);
			System.out.println("Maths : " +mks_m);
			System.out.println("Total : " +total);
			System.out.println("Percentage : " +per);
			System.out.println("Grade : A " );
		}
		else if(per >= 75){
			System.out.println("Student : " +S_name);
			System.out.println("English : " +mks_e);
			System.out.println("Maths : " +mks_m);
			System.out.println("Total : " +total);
			System.out.println("Percentage : " +per);
			System.out.println("Grade : B " );
		}
		else if(per>=50) {
			System.out.println("Student : " +S_name);
			System.out.println("English : " +mks_e);
			System.out.println("Maths : " +mks_m);
			System.out.println("Total : " +total);
			System.out.println("Percentage : " +per);
			System.out.println("Grade : C " );
		}
		else {
			System.out.println("Student : " +S_name);
			System.out.println("English : " +mks_e);
			System.out.println("Maths : " +mks_m);
			System.out.println("Total : " +total);
			System.out.println("Percentage : " +per);
			System.out.println("Grade : Fail " );
		}
		sc.close();
	}

}