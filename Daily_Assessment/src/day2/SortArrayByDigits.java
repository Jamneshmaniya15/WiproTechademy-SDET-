package day2;

import java.util.*;

public class SortArrayByDigits {

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int digits1 = String.valueOf(arr[i]).length();
                int digits2 = String.valueOf(arr[j]).length();

                if (digits1 > digits2) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sortArray(arr);
        sc.close();
    }
}