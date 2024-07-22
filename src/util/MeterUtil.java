package util;

public class MeterUtil {

    public static void start(TimeMeter timeMeter, SpaceMeter spaceMeter) {
        timeMeter.start();
        spaceMeter.start();
    }

    public static void stopAndPrint(TimeMeter timeMeter, SpaceMeter spaceMeter) {
        timeMeter.stopAndPrint();
        spaceMeter.stop();
        spaceMeter.printMBytes();
        spaceMeter.printGBytes();
    }
}
