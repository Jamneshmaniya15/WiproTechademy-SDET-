package Promises;

public class Charfreq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbc";
		int [] count = new int[256];
		
		for(int i = 0; i<s.length();i++) {
			count[s.charAt(i)]++;
		}
		
		for(int i = 0;i<s.length();i++) {
			if(count[s.charAt(i)]!=0) {
				System.out.println(s.charAt(i) +" = "+ count[s.charAt(i)]);
				count[s.charAt(i)]=0;
			}
		}
	}

}
