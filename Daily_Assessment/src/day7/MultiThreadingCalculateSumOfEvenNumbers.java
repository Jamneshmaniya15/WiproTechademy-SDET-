package day7;

import java.util.Scanner;

public class MultiThreadingCalculateSumOfEvenNumbers {
    public static void sumOfRange(int start, int end) {
        // Write your logic here
        Thread thread = new Thread(() -> {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        });

        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //Non editable starts here
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        sumOfRange(start, end);
        scanner.close();
    }
    //Non editable ends here
}