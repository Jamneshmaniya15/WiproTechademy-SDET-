package Promises;

public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Fro3ky is tHe bEs3t poKEMon i1n the 4sERie6S";
		int countV = 0;
		int countS = 0;
		int countD = 0;
		int countU = 0;
		int countL = 0;
		
		for (int e=0 ; e<a.length();e++) {
			char i = a.charAt(e);
			if(i=='A' || i=='E' || i=='I' || i=='O' || i=='U' || i=='a' || i=='e' || i=='i' || i=='o' || i=='u') {
				countV++;
			}
			if(i==' ') {
				countS++;
			}
			if(i>='0' && i<='9') {
				countD++;
			}
			if(i>='A' && i<='Z') {
				countU++;
			}
			if(i>='a' && i<='z') {
				countL++;
			}
		}
		System.out.println("Vowels : "+countV);
		System.out.println("Spaces : "+countS);
		System.out.println("Digits : "+countD);
		System.out.println(("Consonants : "+(a.length()-countV)));
		System.out.println("Upper cases : "+countU);
		System.out.println("Lower cases : "+countL);
	}

}
