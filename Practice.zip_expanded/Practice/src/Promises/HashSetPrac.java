package Promises;
import java.util.*;

public class HashSetPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet <Integer> a = new TreeSet<>();
		a.add(8);
		a.add(9);
		a.add(8);
		a.add(11);
		a.add(12);
		a.add(13);
		a.add(124);
		a.add(15);
		a.add(127);
		
		for ( Integer i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println(a.getFirst());
		System.out.println(a.getLast());
		
	}

}
