package Promises;

public class SentenceCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Froky is tHe bEst poKEMon in the sERieS";
//		String res = "";
//		char [] arr = a.toCharArray();
//		String [] arr2 =a.split(" ");
		
		 
//		for (int i = 0;i<a.length();i++) {
//			if(i==0) {
//				res = res + Character.toUpperCase(a.charAt(i));
//			}else {
//				res += Character.toLowerCase(a.charAt(i));
//			}
//		}
		
//		System.out.println(res); 
//		System.out.println(new String(arr));
//		for (String x : arr2) {
//			System.out.print(x+" ");
//		}
		
		String b = a.toLowerCase();
		String capA=b.substring(0,1).toUpperCase()+b.substring(1);
		System.out.println(capA);
		
	}

}
