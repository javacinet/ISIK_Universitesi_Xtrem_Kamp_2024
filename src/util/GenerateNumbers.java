package util;

import java.util.Stack;

public class GenerateNumbers {

    public static void main(String[] args) {
//        generate_1_DigitNumbers();
//        generate_2_DigitNumbers();
//        generate_3_DigitNumbers();
//        generateNumbersRecursive(5);
        generateNumbersIterative(5);
    }

    public static void generate_1_DigitNumbers() {
        for (int i = 0; i <= 9; i++) {
            System.out.println(i);
        }
    }

    public static void generate_2_DigitNumbers() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                System.out.println("" + i + j);
            }
        }
    }

    public static void generate_3_DigitNumbers() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    System.out.println("" + i + j + k);
                }
            }
        }
    }

    public static void generateNumbersRecursive(int length) {
        if (length < 1) {
            return;
        }

        for (int i = 1; i <= 9; i++) {
            generateNumbersRecursive(length - 1, "" + i);
        }
    }

    private static void generateNumbersRecursive(int length, String number) {
        if (length == 0) {
            System.out.println(number);
            return;
        }
        for (int i = 0; i < 9; i++) {
            generateNumbersRecursive(length - 1, number + i);
        }
    }

    public static void generateNumbersIterative(int length) {
        if (length < 1) {
            return;
        }

        Stack<String> stack = new Stack<>();
        for (int i = 1; i <= 9; i++) {
            stack.push("" + i);
        }

        while (!stack.isEmpty()) {
            String number = stack.pop();
            if (number.length() == length) {
                System.out.println(number);
            } else {
                for (int i = 0; i <= 9; i++) {
                    stack.push(number + i);
                }
            }
        }
    }
}
