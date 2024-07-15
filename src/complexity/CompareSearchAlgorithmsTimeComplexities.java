package complexity;

import recursion.GenerateNumbers;
import util.SpaceMeter;
import util.Timer;

public class CompareSearchAlgorithmsTimeComplexities {

    public static void main(String[] args) {
        Timer timer = new Timer();
        SpaceMeter spaceMeter = new SpaceMeter();

        start(timer, spaceMeter);

        // System.out.println(GenerateNumbers.generateNumbersArrayRecursive(8).size());
        System.out.println(GenerateNumbers.generateNumbersArrayRecursiveNotUsingString(9).size());

        stop(timer, spaceMeter);
    }

    private static void stop(Timer timer, SpaceMeter spaceMeter) {
        timer.stopAndPrint();
        spaceMeter.stop();
        spaceMeter.printMBytes();
        spaceMeter.printGBytes();
    }

    private static void start(Timer timer, SpaceMeter spaceMeter) {
        timer.start();
        spaceMeter.start();
    }

}