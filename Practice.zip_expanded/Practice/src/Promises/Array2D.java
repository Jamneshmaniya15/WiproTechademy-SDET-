package Promises;
//import java.util.*;
public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		
//		System.out.print("Enter the rows : ");
//		int rows = sc.nextInt();
//		System.out.print("Enter columns : ");
//		int cols = sc.nextInt();
//		int [] [] arr = new int[rows][cols];
		int [] [] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int k = 12;
//		for (int i=0;i<rows;i++) {
//			for (int j=0;j<cols;j++) {
//				arr[i][j]=sc.nextInt();
//			}
//		}
		for ( int i=0;i<3;i++) {
			for(int j = 0;j<4;j++) {
				if(arr[i][j]==k) {
					System.out.println(i+ " "+j);
				}
			}
		}
		
//		for (int i=0;i<rows;i++) {
//			for (int j=0;j<cols;j++) {
//				System.out.print(arr[i][j] + " ");
//		}
//			System.out.println();
//	}
	}
}
