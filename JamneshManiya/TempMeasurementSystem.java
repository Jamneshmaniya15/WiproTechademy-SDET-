package JamneshManiya;
import java.util.Scanner;
public class TempMeasurementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enetr the name of City : ");
		String city = sc.nextLine();
		System.out.print("Enter the Temperature : ");
		float temp = sc.nextFloat();
		int threshold = 30;
		boolean isHot;
		System.out.println("City : " + city);
		System.out.println("Temperature :" + temp);
		if(temp > threshold) {
			isHot =true;			
		}else {
			isHot = false;			
		}
		
		if(isHot==true) {
			System.out.println("Hot Day");
		}else {
			System.out.println(("Normal Day"));
		}
		sc.close();

	}

}