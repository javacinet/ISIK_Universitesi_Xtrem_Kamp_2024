package _3_complexity;

import util.MeterUtil;
import util.SpaceMeter;
import util.Timer;

public class CompareSearchAlgorithmsTimeComplexities {

    public static void main(String[] args) {
        Timer timer = new Timer();
        SpaceMeter spaceMeter = new SpaceMeter();

        MeterUtil.start(timer, spaceMeter);

        // System.out.println(GenerateNumbers.generateNumbersArrayRecursive(8).size());
        // System.out.println(GenerateNumbers.generateNumbersArrayRecursiveNotUsingString(9).size());

        MeterUtil.stopAndPrint(timer, spaceMeter);
    }


}