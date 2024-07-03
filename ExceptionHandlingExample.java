public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // This block of code may throw an exception
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // This block catches and handles the exception
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            // This block will always execute, regardless of exception
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }

    public static int divide(int a, int b) {
        return a / b; // This will throw ArithmeticException if b is 0
    }
}
