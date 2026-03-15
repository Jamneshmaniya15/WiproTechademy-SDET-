package exception_handling;

public class MultipleExceptionExample {

    public static void main(String[] args) {

        try {

            int[] values = {1, 2, 3};
            int result = values[5] / 0;

            System.out.println(result);
        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Exception occurred");
        }

        catch (Exception e) {
            System.out.println("General Exception occurred");
        }

        finally {
            System.out.println("Finally block always executes");
        }
    }
}