package excercise7;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacciRecursive(1));
        System.out.println(fibonacciRecursive(2));
        System.out.println(fibonacciRecursive(3));
        System.out.println(fibonacciRecursive(4));
        System.out.println(fibonacciRecursive(5));
        System.out.println(fibonacciRecursive(6));
        System.out.println(fibonacciRecursive(7));
        System.out.println(fibonacciRecursive(10));
    }

    private static int fibonacciRecursive(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("There is no " + number + " fibo number");
        }
        return number < 3 ? 1 : fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2);
    }

    private static int fibonacciFor(int number) {
        int previousPreviousNumber = 1;
        int previousNumber = 1;
        int result = 1;

        for (int i = 3; i <= number; i++) {
            result = previousPreviousNumber + previousNumber;
            previousPreviousNumber = previousNumber;
            previousNumber = result;
        }

        return result;
    }
}
