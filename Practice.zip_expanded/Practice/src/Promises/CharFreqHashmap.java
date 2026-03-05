package Promises;
import java.util.HashMap;

public class CharFreqHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> map = new HashMap<>();
		String s="aaabbc";
		
		for(char ch : s.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		
		for(char c : map.keySet()) {
			System.out.println(c +"="+map.get(c));
		}
	}

}
