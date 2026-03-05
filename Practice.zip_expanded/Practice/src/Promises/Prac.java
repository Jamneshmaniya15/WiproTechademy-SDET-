package Promises;

public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ab def  gh";
		StringBuilder res = new StringBuilder();
		int count = 0;
		boolean space = false;
		
		for(int i = 0;i<s.length();i++) {
			char c = s.charAt(i);
			
			if(c ==' ') {
				count++;
				space = true;
			}else {
				if(count == 1){
					res.append("%20");
				}else if(count >=2) {
					res.append("%30");
				}
				count = 0;
				res.append(c);
			}
		}
		if(count == 1) {
			res.append("%20");
		}else if(count >=2) {
			res.append("%30");
		}
		
		if(!space) {
			res.append("%40");
		}
		
		System.out.println(res);
	}

}
