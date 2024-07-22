package _4_brutForce;

import util.GenerateNumbers;
import util.TimeMeter;

import static util.PrintUtil.printText;

public class RandomSort {

    public static void main(String[] args) {
        TimeMeter timeMeter = new TimeMeter();

        for (int i = 2; i <= 20; i++) {
            var array = GenerateNumbers.generateRandomNumbers(i, Integer.MAX_VALUE);

            printText("Random sort for array lenght: %4d", i);
            timeMeter.start();
            brutForceSearch(array);
            timeMeter.stopAndPrint();
        }


    }

    public static void brutForceSearch(int[] array) {
       while(!isArraySorted(array))
        shuffleArray(array);
    }

    private static boolean isArraySorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }
        return true;
    }

    private static void shuffleArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int randomIndex = (int) (Math.random() * array.length);
            int temp = array[randomIndex];
            array[randomIndex] = array[i];
            array[i] = temp;
        }
    }
}
