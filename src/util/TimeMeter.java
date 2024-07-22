package util;

import static util.PrintUtil.*;

public class TimeMeter {

    private long start;
    private double elapsedTime;

    public void start() {
        start = System.currentTimeMillis();
        elapsedTime = 0;
    }

    public double stop() {
        long now = System.currentTimeMillis();
        elapsedTime = (now - start) / 1000.0;
        return elapsedTime;
    }

    public void print() {
        printTimer("TIMER: Process takes %.2f seconds\n", elapsedTime);
    }

    public void stopAndPrint() {
        stop();
        print();
    }
}