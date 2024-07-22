package _2_recursion;

import util.TimeMeter;

import static util.PrintUtil.*;

public class FibonacciMain {
    public static void main(String[] args) {
        TimeMeter timeMeter = new TimeMeter();

        int n = 50;

        timeMeter.start();
        printText("Using DP: \t" + Fibonacci.fibonacciDP(n));
        timeMeter.stopAndPrint();

        timeMeter.start();
        printText("Not a DP: \t" + Fibonacci.fibonacci(n));
        timeMeter.stopAndPrint();
    }
}
