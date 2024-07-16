package _1_intro;

import util.SpaceMeter;
import util.Timer;

import static util.MeterUtil.*;

import static util.PrintUtil.*;

public class StringCompare {
    public static void main(String[] args) {
        int n = 100_000;

        Timer timer = new Timer();
        SpaceMeter spaceMater = new SpaceMeter();

        start(timer, spaceMater);
        printText("String compare for size: " + n);
        concatanateString(n);
        stopAndPrint(timer, spaceMater);
    }

    private static void concatanateString(int n) {
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "a";
        }
    }


}
