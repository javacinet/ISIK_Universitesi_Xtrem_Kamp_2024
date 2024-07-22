package _4_brutForce;

import util.TimeMeter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static util.GenerateNumbers.generateRandomNumbers;
import static util.PrintUtil.printText;

public class TwoSumMain {
    public static void main(String[] args) {
        TimeMeter timeMeter = new TimeMeter();
        final int N = 200_000;
        final int UPPER = 100;
        final int TARGET = 50;

        printText("number size: " + N);

        printText("Generate random numbers for size: " + N);
        timeMeter.start();
        int[] numbers = generateRandomNumbers(N, UPPER);
        timeMeter.stopAndPrint();

        printText("Find pairs brut force ");
        timeMeter.start();
        List<Pair> list = findPairsBrutForce(numbers, TARGET);
        timeMeter.stopAndPrint();

        printText("Size of pairs: " + list.size());
    }



    private static List<Pair> findPairsBrutForce(int[] numbers, int target) {
        List<Pair> pairList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    pairList.add(new Pair(i, j));
                }
            }
        }

        return pairList;
    }
}

record Pair(int n1, int n2) {}
