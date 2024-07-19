package util;

public class StringGenerator {


    public static String generateRandomLowerCaseString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(RandomCharacter.getRandomCharacter('a', 'z'));
        }
        return sb.toString();
    }

    public static String generateRandomUperCaseString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(RandomCharacter.getRandomCharacter('A', 'Z'));
        }
        return sb.toString();
    }

    public static String generateRandomDigitString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(RandomCharacter.getRandomCharacter('0', '9'));
        }
        return sb.toString();
    }

    public static String generateRandomString(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append(RandomCharacter.getRandomCharacter('\u0000', '\uFFFF'));
        }
        return sb.toString();
    }
}
