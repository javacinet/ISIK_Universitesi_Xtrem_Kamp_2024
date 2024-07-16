package util;

public class MeterUtil {

    public static void start(Timer timer, SpaceMeter spaceMeter) {
        timer.start();
        spaceMeter.start();
    }

    public static void stopAndPrint(Timer timer, SpaceMeter spaceMeter) {
        timer.stopAndPrint();
        spaceMeter.stop();
        spaceMeter.printMBytes();
        spaceMeter.printGBytes();
    }
}
