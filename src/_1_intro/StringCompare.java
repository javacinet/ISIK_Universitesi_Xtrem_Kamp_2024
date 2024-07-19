package _1_intro;

import util.SpaceMeter;
import util.Timer;

import static util.MeterUtil.*;

import static util.PrintUtil.*;

public class StringCompare {
    public static void main(String[] args) {
        Timer timer = new Timer();
        SpaceMeter spaceMater = new SpaceMeter();

        int n = 100_000;

        start(timer, spaceMater);
        printText("String concatenate for size: " + n);
        concatenateString(n);
        stopAndPrint(timer, spaceMater);

        start(timer, spaceMater);
        printText("StringBuilder concatenate for size: %d", n);
        concatenateStringUsingStringBuilder(n);
        stopAndPrint(timer, spaceMater);

        n = 1_000_000;

        start(timer, spaceMater);
        printText("StringBuilder concatenate for size: %d", n);
        concatenateStringUsingStringBuilder(n);
        stopAndPrint(timer, spaceMater);

        n = 1_000_000_000;
        start(timer, spaceMater);
        printText("StringBuilder concatenate for size: %d", n);
        concatenateStringUsingStringBuilder(n);
        stopAndPrint(timer, spaceMater);

    }

    private static void concatenateStringUsingStringBuilder(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("a");
        }
    }

    private static void concatenateString(int n) {
        String str = "";
        for (int i = 0; i < n; i++) {
            str += "a";
        }
    }


}
