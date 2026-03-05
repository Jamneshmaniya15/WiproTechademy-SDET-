package Promises;
//import java.util.*;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "Techademy";
		//String rev ="";
		
//		for (int i =s.length()-1;i>=0;i--) {
//			rev = rev + s.charAt(i);
//		}
//		
//		System.out.println(rev);
//		
//		if(rev.equals(s)) {
//			System.out.println("pal");
//		}else {
//			System.out.println("npot");
//		}
		//------------------------------------------------//
//		
//		int count=0;
//		for(int i = 0;i<s.length();i++) {
//			char c = s.charAt(i);
//			if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u' ||c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U' ) {
//				count++;
//			}
//		}
//		
//		System.out.println(count);
//		
		//---------------------------------------------------//
//		int n = s.length();
//		for(int i = 0;i<s.length();i++) {
//			char a = s.charAt(i);
//			for(int j = i;j<s.length();j++) {
//				char b = s.charAt(j);
//				if(a==b) {
//					count++;
//				}else {
//					int count =  1;
//					System.out.println(b +"="+ count);
//				}
//			}
//		}
		//-------------------------------------------------------//
//		LinkedHashSet <Character> set = new LinkedHashSet<>();
//		
//		for(char ch : s.toCharArray()) {
//			set.add(ch);
//		}
//		
//		for(char ch : set) {
//			System.out.print(ch);
//		}
		
//		String n="";
//		for(int i = 0;i<s.length();i++) {
//			char x = s.charAt(i);
//			if(n.indexOf(x)==-1) {
//				n = n+x;
//			}
//		}
//		System.out.println(n);
////	---------------------------------------------------------------//	
			
//		int [] arr = {12,3,4,3,5,78,4,32,4};
//		int min = arr[0];
//		int max = arr[0];
//		
//		for(int i = 0; i<arr.length;i++) {
//			if(arr[i]<min) {
//				min = arr[i];
//			}
//			
//			if(arr[i]>max) {
//				max = arr[i];
//			}
//			
//		}
//		System.out.println(min +" "+ max);
	//------------------------------------------------------------------------//
//		for(int i = 0;i<arr.length/2;i++) {
//			
//				int temp = arr[i];
//				arr[i] = arr[arr.length-i-1];
//				arr[arr.length-i-1] = temp;
//			}
//		
//		for(int a : arr) {
//			System.out.print(a+" ");
//		}
		
//		ArrayList <Integer> arlt = new ArrayList<>();
//		
//		for(int i = arr.length-1;i>=0;i--) {
//			arlt.add(arr[i]);
//		}
//		
//		System.out.println(arlt);
		
		//--------------------------------------------------------------//
//		int sum = 0;
//		
//		for(int i = 0;i<arr.length;i++) {
//			sum+=arr[i];
//		}
//		System.out.println(sum);
		
		//=-------------------------------------------------------//
//		for(int i = 0;i<arr.length;i++) {
//			for(int j =i+1;j<arr.length;j++) {
//				if(arr[i]==arr[j]) {
//					System.out.println(arr[i]);
//				}
//			}
//		}
		
//		HashSet <Integer> seen = new HashSet<>();
//		HashSet <Integer> d = new HashSet<>();
//		
//		for(int x : arr) {
//			if(!seen.add(x)) {
//				d.add(x);
//			}
//		}
//		System.out.println(d);
		
		//int n = 7;
//		boolean isPrime = true;
//		if(n<=1) {
//			isPrime=false;
//		}else {
//			for(int i =2;i<=n;i++) {
//				if(n%i==0) {
//					isPrime = false;
//					break;
//				}
//			}
//		}
//		if(isPrime) {
//			System.out.println("Prime");
//		}else {
//			System.out.println("notPrime");
//		}
//		
//		------------------------------------------//
		
//		int a = 0;
//		int b = 1;
//		
//		for(int i = 0;i<=n;i++) {
//			System.out.println(a);
//			int c=a+b;
//			int temp = a;
//			a=b;
//			b=c;
//			c=temp;
//		}	
			//=======================================//
//		int fact =1;
//		for(int i = 1;i<=n;i++) {
//			fact=fact*i;
//		}
//		System.out.println(fact);
//		
		//==----------------------------------------------//
//		int n = 153;
//		int temp = n;
//		int count = 0;
//		
//		while(temp!=0) {
//			count++;
//			temp/=10;
//		}
//		int temp2 = n;
//		double sum =0;
//		while(temp2!=0) {
//			int digit = temp2%10;
//			
//				sum = sum + Math.pow(digit, count);
//			
//			temp2/=10;
//		}
//		if(n==sum) {
//			System.out.println("armstrong");
//		}else {
//			System.out.println("not");
//		}
//		-----------------------------------------------------//
		
//		int n = 112345;
//		int r=0;
//		
//		while(n!=0) {
//			int digit = n%10;
//			r =r*10+digit;
//			n/=10;
//		}
//		System.out.println(r);
		
		
	}

}