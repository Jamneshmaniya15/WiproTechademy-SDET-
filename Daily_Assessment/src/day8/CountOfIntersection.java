package day8;

import java.util.Scanner;

public class CountOfIntersection {

    private static int numStudents(int A, int B, int C, int D, int E, int F, int G) {
        int numIntersection = 0;
        // Write your logic here:

        numIntersection = G - A - B - C + D + E + F;

        return numIntersection;
    }

    //Non editable starts here
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();
        int F = scanner.nextInt();
        int G = scanner.nextInt();

        int result = numStudents(A, B, C, D, E, F, G);
        System.out.println(result);

        scanner.close();
    }
}
//Non editable ends here
