package _2_recursion;

import util.Timer;

import static util.PrintUtil.*;

public class FibonacciMain {
    public static void main(String[] args) {
        Timer timer = new Timer();

        int n = 50;

        timer.start();
        printText("Using DP: \t" + Fibonacci.fibonacciDP(n));
        timer.stopAndPrint();

        timer.start();
        printText("Not a DP: \t" + Fibonacci.fibonacci(n));
        timer.stopAndPrint();
    }
}
