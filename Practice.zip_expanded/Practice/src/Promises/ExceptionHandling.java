package Promises;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);

        try {
            String x = sc.next();
            String y = sc.next();

            int a = Integer.parseInt(x);
            int b = Integer.parseInt(y);

            int c = a / b;
            System.out.println("Result: " + c);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        sc.close();
        
    }
}
