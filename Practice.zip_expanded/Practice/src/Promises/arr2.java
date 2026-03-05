package Promises;
//import java.util.*;
public class arr2 {

	public static void main(Stringa[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,85,6,79,1,6,3,7};
		int sum = 0;
		int max = arr[0];
		int min = arr[0];
		for (int i = 0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println("avg: " +(sum/arr.length));
		for (int i =0;i<arr.length;i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("hhigest : "+max);
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("Smallest : "+min);
		for (int i = arr.length - 1; i >= 0; i--) {
		    System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(int i= 0;i<arr.length-1;i++) {
			for(int j =0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int x : arr) {
			System.out.print(x + " ");
			
		}
		System.out.println();

		
		
	}

}
