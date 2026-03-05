package Promises;
import java.util.*;
public class arr1 {

	public static void main(Stringa[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("n:");
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for (int i=0;i<n;i++) {
			System.out.print("e:");
			arr[i] = sc.nextInt();
			
		
			
		}
		int a =sc.nextInt();
		for(int j=0;j<n;j++) {
			if(arr[j]==a) {
				System.out.println(j);
			}
		}
		for (int i =0;i<n;i++) {
			System.out.println(arr[i]);
		}
		sc.close();
		
		

	}

}
