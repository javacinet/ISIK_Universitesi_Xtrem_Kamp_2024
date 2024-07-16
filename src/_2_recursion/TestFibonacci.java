package _2_recursion;

import util.Timer;

import static util.PrintUtil.*;

public class TestFibonacci {
    public static void main(String[] args) {
        Timer timer = new Timer();

        int n = 5;

        timer.start();
        printText("Using Map: \t" + Fibonacci.fibonacciDP(n));
        timer.stopAndPrint();

        timer.start();
        printText("Not a DP: \t" + Fibonacci.fibonacci(n));
        timer.stopAndPrint();
    }
}
