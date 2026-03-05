package Promises;
import java.util.*;

public class LinkedListPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> a = new LinkedList<>();
		a.add("Pokemon");
		a.add("Ninja Hathodi");
		a.add("BeyBlade");
		a.add("DragonBallZ");
		a.add("ShinChan");
		for ( String i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		a.addFirst("PowerRangers");
		a.addLast("Naruto");
		
		for ( String i : a) {
			System.out.print(i + " ");
		}	
		System.out.println();
		
		a.remove("ShinChan");
		a.remove(2);
		
		for ( String i : a) {
			System.out.print(i + " ");
		}	
		System.out.println();
		
	}

}
