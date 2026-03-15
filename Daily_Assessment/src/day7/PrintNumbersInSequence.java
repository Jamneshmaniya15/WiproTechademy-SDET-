package day7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.Scanner;

public class PrintNumbersInSequence {
    // write your logic here
    private int n;
    private int current;
    private Lock lock = new ReentrantLock();

    public PrintNumbersInSequence(int n) throws InterruptedException {
        // write your logic here
        this.n = n;
        this.current = 1;

        StringBuilder result = new StringBuilder();

        Thread t1 = new Thread(() -> printNumbers(result));
        Thread t2 = new Thread(() -> printNumbers(result));
        Thread t3 = new Thread(() -> printNumbers(result));

        t1.start(); t2.start(); t3.start();
        t1.join();  t2.join();  t3.join();

        System.out.println(result.toString().trim());
    }

    private void printNumbers(StringBuilder result) {
        while (true) {
            lock.lock();
            try {
                if (current > n) break;
                if (result.length() > 0) result.append(" ");
                result.append(current);
                current++;
            } finally {
                lock.unlock();
            }
        }
    }

    // Non editable starts here
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        PrintNumbersInSequence obj = new PrintNumbersInSequence(n);
        scanner.close();
    }
}
// Non editable ends here
