package day3;
import java.util.Scanner;


class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Err: division by zero");
            return 0;
        }
        return a / b;
    }
}

public class SimpleCalculator {
    public static int calculate(int a, int b, char op) {

        Calculator calc = new Calculator();

        if (op == '+') {
            return calc.add(a, b);
        } 
        else if (op == '-') {
            return calc.subtract(a, b);
        } 
        else if (op == '*') {
            return calc.multiply(a, b);
        } 
        else if (op == '/') {
            return calc.divide(a, b);
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        char op = sc.nextLine().charAt(0);

        int result = calculate(a, b, op);

        if (op != '/' || b != 0) {
            System.out.println(result);
        }

        sc.close();
    }
}