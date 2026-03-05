package Promises;
import java.util.*;
public class Array2D2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.print("n : ");
		int n = sc.nextInt();
		
		int [] [] arr = new int[n][n];
		
		int sum =0;
		
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("Enter the vale for index " +i+ " " +j);
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					sum = sum +arr[i][j];
				}
			}
		}
		System.out.println(sum);
		sc.close();
	}

}
