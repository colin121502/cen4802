public class Fibonacci {
    /**
     * A recursive method to calculate the nth term of the Fibonacci sequence.
     * @param n the term of the Fibonacci sequence to calculate
     * @return the nth Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 10; // The term to calculate
        int result = fibonacci(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}
