package util;

import java.io.File;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;

public class PasswordGenerator {


    public static List<String> generateAllPossiblePasswordForVisibleAsciiChars(int length) {
        if (length <= 0)
            throw new InvalidParameterException();

        char lower = ' '; // 32
        char upper = '~'; // 126
        return generateAllPossiblePassword(length, lower, upper);
    }

    public static List<String> generateAllPossiblePassword(int length, char lower, char upper) {
        if (length <= 0)
            throw new InvalidParameterException();

        List<String> passwordList = new ArrayList<>();

        generatePasswordHelper(passwordList, length, lower, upper, "");

        return passwordList;
    }

    private static void generatePasswordHelper(List<String> passwordList, int length, char lower, char upper, String prefix) {
        if (length == 0) {
            passwordList.add(prefix);
            return;
        }
        for (char ch = lower; ch <= upper; ch++) {
            generatePasswordHelper(passwordList, length - 1, lower, upper, prefix + ch);
        }
    }
}
