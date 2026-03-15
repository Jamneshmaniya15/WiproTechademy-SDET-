package exception_handling;

public class ArrayExceptionExample {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30};

        try {
            System.out.println(numbers[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of range");
        }

        System.out.println("Array program finished");
    }
}