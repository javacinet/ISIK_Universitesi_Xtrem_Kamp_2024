package brutforce;

import util.FileUtil;
import util.PasswordGenerator;

import java.io.File;
import java.util.List;

public class GeneratePasswordMain {

    private static final String generatedPasswordsDirectory = "generatedPasswords" + File.separator;

    public static void main(String[] args) {
        final int maxLengthOfPassword = 10;

        for (int length = 1; length <= maxLengthOfPassword; length++) {
            List<String> passwordList = PasswordGenerator.generateAllPossiblePasswordForVisibleAsciiChars(length);
            String fileName = generatedPasswordsDirectory + "password_length_" + length + ".txt";
            FileUtil.writelistToFile(passwordList, fileName);
            System.out.println("File created: " + fileName);
        }
    }
}
