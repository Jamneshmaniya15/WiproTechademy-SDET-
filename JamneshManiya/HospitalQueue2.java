package JamneshManiya;
import java.util.*;
public class HospitalQueue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		LinkedList<String> p = new LinkedList<>();
		
		while (true) {
		    System.out.println("------------MENU-----------");
		    System.out.println("1. Enter Patient data");
		    System.out.println("2. Add Emergency Patient");
		    System.out.println("3. Data of 1st Patient");
		    System.out.println("4. Data of last Patient");
		    System.out.println("5. Display");
		    System.out.println("0. Exit");
		    System.out.print("Enter your choice: ");

		    int ch = sc.nextInt();
		    sc.nextLine(); // clear buffer

		    switch (ch) {
		        case 1:
		            System.out.print("Enter patient name: ");
		            p.add(sc.nextLine());
		            break;

		        case 2:
		            System.out.print("Emergency patient name: ");
		            p.addFirst(sc.nextLine());
		            break;

		        case 3:
		            if (p.isEmpty())
		                System.out.println("No patients in queue.");
		            else
		                System.out.println("First Patient: " + p.getFirst());
		            break;

		        case 4:
		            if (p.isEmpty())
		                System.out.println("No patients in queue.");
		            else
		                System.out.println("Last Patient: " + p.getLast());
		            break;

		        case 5:
		            if (p.isEmpty())
		                System.out.println("Queue is empty.");
		            else
		                for (String pa : p)
		                    System.out.println(pa);
		            break;

		        case 0:
		            System.out.println("Exiting...");
		            sc.close();
		            return;

		        default:
		            System.out.println("Invalid choice!");
		    }
		}

	}

}