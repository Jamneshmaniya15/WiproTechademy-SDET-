package Promises;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "madam";
		StringBuffer sb = new StringBuffer(a);
		sb.reverse();
		String s = "aba";
		String rev = "";
		 
		for(int i=s.length()-1;i>=0;i--) {
			rev =rev +s.charAt(i);
				
			
		}
		
		if (s.equals(rev)) {
			System.out.println("Is Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		
		if(a.equals(sb.toString())) {
			System.out.println("P");
		}else {
			System.out.println(("NP"));
		}
		
		
	}

}
