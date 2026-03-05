package Promises;

public class MutupilcationMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		int arr1[][] = {{7,-1},{5,-4}};
		int arr2[][] = {{2,5},{4,3}};
		int arr[][] = new int[n][n];
		
		
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j]+=arr1[i][j]*arr2[i][j];
			}
		}
		
		for(int i =0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
		
	}

}
