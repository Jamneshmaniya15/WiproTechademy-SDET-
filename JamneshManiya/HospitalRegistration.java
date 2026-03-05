package JamneshManiya;
import java.util.*;


public class HospitalRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet <Integer> p = new HashSet();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of patient : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
            System.out.print("Enter the ID of patient " + i + ": ");
            int id = sc.nextInt();
            
            if(p.contains(id)) {
            	System.out.println("Already registered");
                
            } else  {
            	p.add(id);
            	System.out.println("Success: Patient " + id + " added");
            }
        }
			
		System.out.println("Final Patient List: ");
        System.out.println(p);
        
        sc.close();
    }
}