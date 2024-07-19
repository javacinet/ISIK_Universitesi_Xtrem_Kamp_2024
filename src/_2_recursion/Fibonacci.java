package _2_recursion;

public class Fibonacci {
    public static long fibonacci(int n) {
        if (n <= 1)
            return n;
        
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static long fibonacciDP(int n) {
        long[] fib = new long[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        return fibonacciDPHelper(fib, n);
    }

    public static long fibonacciDPHelper(long[] cache, int n) {
        if (n <= 1) {
            return n;
        }

        if (cache[n] != 0) {
            return cache[n];
        }
        cache[n] = fibonacciDPHelper(cache, n - 1) + fibonacciDPHelper(cache, n - 2);

        return cache[n];
    }
}
