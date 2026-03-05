package Promises;

public class Stringa {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String a = "Froky is the best Pokemon in the series";
//		String result = "";
//		
//		
//		for (int i = 0;i<a.length();i++) {
//			char x = a.charAt(i);
//			
//			if(i==0 || a.charAt(i-1) == ' ') {
//				result  = result + Character.toUpperCase(x);
//			}else {
//				result = result +x;
//			}
//		}
//		System.out.println(result);
		String b=a.toLowerCase();
		System.out.println(b);
		String [] arr = b.split(" ");
		String res = "";
		
//		for(int i = 0;i<arr.length;i++) {
//			for(int j = 0;j<arr[i].length();j++) {
//				if (j==0) {
//					res = res + Character.toUpperCase(arr[i].charAt(j));
//				}else {
//					res = res + arr[i].charAt(j);
//				}
//				
//			}
//			res = res +" ";
//		}
		
		for(String ar : arr) {
			if(ar.length()>0) {
				res = res + Character.toUpperCase(ar.charAt(0))+ar.substring(1)+" ";
			}
		}
		System.out.println(res);
		
	}

}
