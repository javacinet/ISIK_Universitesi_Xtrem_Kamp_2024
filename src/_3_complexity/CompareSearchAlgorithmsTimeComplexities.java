package _3_complexity;

import util.*;
import util.Timer;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

import static util.PrintUtil.printText;

public class CompareSearchAlgorithmsTimeComplexities {

    public static void main(String[] args) {
        Timer timer = new Timer();
        SpaceMeter spaceMeter = new SpaceMeter();

        int n = 10_000_000;
        int length = 100;

        MeterUtil.start(timer, spaceMeter);
//        printText("Generate random string array");
//        String[] array = generateRandomStringArray(n, length);
        printText("Read generated strings from a file");
        String[] array = FileUtil.readArrayFromFile("data/generatedString.txt");
        MeterUtil.stopAndPrint(timer, spaceMeter);

//        FileUtil.writeArrayToFile(array, "data/generatedString.txt");


        printText("Print first string %10s", array[0]);
        String[] keys100 = findKeys(array, 100);
        String[] keys100_000 = findKeys(array, 100_000);

        searchKeysInArrayList(array, keys100);

        searchKeysInLinkedList(array, keys100_000);

        searchKeysInHashSet(array, keys100_000);

        searchKeysInTreeSet(array, keys100_000);

    }

    private static void searchKeysInArrayList(String[] array, String[] keys) {
        Supplier<Collection<String>> collectionCreator = (() -> new ArrayList<>(Arrays.asList(array)));
        searchInCollection(keys, collectionCreator, ArrayList.class);
    }

    private static void searchKeysInLinkedList(String[] array, String[] keys) {
        Supplier<Collection<String>> collectionCreator = (() -> new LinkedList<>(Arrays.asList(array)));

        searchInCollection(keys, collectionCreator, LinkedList.class);
    }

    private static void searchKeysInHashSet(String[] array, String[] keys) {
        Supplier<Collection<String>> collectionCreator = (() -> new HashSet<>(Arrays.asList(array)));
        searchInCollection(keys, collectionCreator, HashSet.class);
    }

    private static void searchKeysInTreeSet(String[] array, String[] keys) {
        Supplier<Collection<String>> collectionCreator = (() -> new TreeSet<>(Arrays.asList(array)));
        searchInCollection(keys, collectionCreator, TreeSet.class);
    }

    private static void searchInCollection(String[] keys, Supplier<Collection<String>> collectionCreator, Class clazz) {
        System.gc();
        Timer timer = new Timer();
        SpaceMeter spaceMeter = new SpaceMeter();

        MeterUtil.start(timer, spaceMeter);
        printText("Create collection");
        printText("Adding array into " + clazz);
        Collection<String> collection = collectionCreator.get();
        MeterUtil.stopAndPrint(timer, spaceMeter);

        MeterUtil.start(timer, spaceMeter);
        printText("Search in " + collection.getClass());
        for (String key : keys) {
            collection.contains(key);
        }
        MeterUtil.stopAndPrint(timer, spaceMeter);
    }

    private static String[] findKeys(String[] array, int length) {
        String[] keys = new String[length];
        for (int i = 0; i < length; i++) {
            int randomIndex = (int) (Math.random() * array.length);
            keys[i] = array[randomIndex];
        }
        return keys;
    }

    private static String[] generateRandomStringArray(int n, int length) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = StringGenerator.generateRandomString(length);
        }
        return array;
    }


}