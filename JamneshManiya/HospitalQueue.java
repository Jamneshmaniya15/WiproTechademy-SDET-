package JamneshManiya;
import java.util.*;


public class HospitalQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> p = new LinkedList<>();
		p.add("Ram");
		p.add("Sham");
		p.add("nam");
		p.add("jam");
		System.out.print("Patient List : ");
		System.out.println(p);
		
		System.out.print("Adding a emergency patient : ");
		p.addFirst("kam");
		System.out.println(p);
		
		System.out.print("Removing a patient : ");
		p.remove("nam");
		System.out.println(p);
		
		System.out.println("First Patient in line : "+p.getFirst());
		
		System.out.println("Last Patient in line : "+p.getLast());
		System.out.println();
		
		for (String pa : p) {
			System.out.println(pa);
		}

	}

}