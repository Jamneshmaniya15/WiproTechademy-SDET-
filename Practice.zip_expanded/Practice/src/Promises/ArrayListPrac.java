package Promises;
import java.util.*;

public class ArrayListPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> a = new ArrayList<>();
		a.add(1);
		a.add(21);
		a.add(34);
		a.add(54);
		a.add(45);
		for ( Integer i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		a.remove(1);
		a.remove(Integer.valueOf(34));
		for ( Integer i : a) {
			System.out.print(i + " ");
		}	
		System.out.println();
		
		int max =a.get(0);
		for(Integer i: a) {
			if (i>max){
				max = i;
			}
		}
		System.out.println(max);
	}

}
