package collections;

import java.util.*;
import java.util.Map;
 
public class BasicMapExample {
public static void main(String[] args)
{
Map<Integer, String>Employee = new HashMap<>();
 
		Employee.put(101, " Vinay ");
		Employee.put(102, " Sonali ");
		Employee.put(103, " Renu ");
		
		System.out.println(Employee);
		
		System.out.println(Employee.containsKey(103));
		System.out.println(Employee.containsValue("Renu"));
		
		System.out.println(Employee.get(102));
		
		Employee.compute(104, (k,v)->"jam");
		System.out.println(Employee);
		
		Employee.compute(104,(k,v)->v+"nesh");
		System.out.println(Employee);
		
		Employee.computeIfAbsent(105, k -> "sai");
		System.out.println(Employee);
		
		Employee.clear();
		System.out.println(Employee);
 
	}
 
}