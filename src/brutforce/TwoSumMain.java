package brutforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class TwoSumMain {
    public static void main(String[] args) {
        final int N = 1_000_000;
        final int UPPER = 100;
        final int TARGET = 50;

        System.out.println("number size: " + N);

        long start = System.currentTimeMillis();
        int[] numbers = generateNumbers(N, UPPER);
        long end = System.currentTimeMillis();
        System.out.println("Generation takes: " + (end - start) / 1000 + " seconds");

        // System.out.println(Arrays.toString(numbers));
        start = System.currentTimeMillis();
        List<Pair> list = findPairsBrutForce(numbers, TARGET);
        end = System.currentTimeMillis();
        System.out.println("Finding (brut force) takes: " + (end - start) / 1000 + " seconds");

        System.out.println("Size of pairs: " + list.size());
    }

    private static int[] generateNumbers(int length, int upper) {
        return IntStream.generate(() -> (int) (Math.random() * upper))
                .limit(length)
                .toArray();
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
