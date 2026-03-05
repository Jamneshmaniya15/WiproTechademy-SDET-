package JamneshManiya;
import java.util.*;
public class TryCollectionMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<>();
		a.add(121);
		a.add(123);
		a.add(345);
		a.add(234);
		a.add(123);
		System.out.println(a);
		
		a.add(2,675);
		System.out.println(a);
		
		a.addFirst(321);
		System.out.println(a);
		
		List<Integer> b = new ArrayList<>();
		b.add(23);
		b.add(45);
		b.add(67);
		
		a.addAll(b);
		System.out.println(a);
		
		a.addAll(2, b);
		System.out.println(a);
		
		a.addLast(9);
		System.out.println(a);
		
		System.out.println(a.contains(675));
		
		System.out.println(a.containsAll(b));
		
		System.out.println(a.equals(b));
		
		a.forEach(System.out::println);
		
		
		
		
		
		a.clear();
		System.out.println(a);

	}

}