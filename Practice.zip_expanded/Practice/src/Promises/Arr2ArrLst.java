package Promises;
import java.util.*;

public class Arr2ArrLst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		int [] arr = {1,2,3,4,5};
		
		for(int a :arr) {
			list.add(a);
		}
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.reversed());
		System.out.println(list.getFirst());
		
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list.getFirst());
	}

}