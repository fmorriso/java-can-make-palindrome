import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        System.out.format("Java version: %s%n", getJavaVersion());
        System.out.format("JUnit version: %s%n", getJUnitVersion());

        String word;
        boolean isPalindrome;

        word = "abxa"; // should be true
        isPalindrome = canMakePalindrome(word);
        System.out.format("word: %s, canMakePalindrome: %b%n", word, isPalindrome);

        word = "drpepper"; // should be false
        isPalindrome = canMakePalindrome(word);
        System.out.format("word: %s, canMakePalindrome: %b%n", word, isPalindrome);

    }

    /**
     * Determines if the specified string can be made into a palindrome by removing at most
     * one character.
     * @param word
     * @return true if the word can be made into a palindrome; otherwise, returns false.
     * @implNote We use a dictionary to count characters.  If only one character has a odd number of occurrences,
     * we know we can remove that character and still make the remaining characters into a palindrome.
     *
     * Example 1: raycecar => true
     * Example 2: abxa => true
     */
    public static boolean canMakePalindrome(String word) {
        // don't waste time on words that are already a palindrome.
        if (word.length() < 2) return true;

        int numOddOccurrences = 0;
        Dictionary<String, Integer> dictionary = new Hashtable<>();
        // count occurrences of each letter in the string
        for (int i = 0; i < word.length(); i++) {
            String key = word.substring(i, i + 1);
            if (dictionary.get(key) == null) dictionary.put(key, 1);
            else {
                int count = dictionary.get(key) + 1;
                dictionary.put(key, count);
            }
        }

        // now check each letter/count key/value pair to see which ones have an odd count.
        Enumeration<String> keys = dictionary.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            int count = dictionary.get(key);
            if (count % 2 == 1) numOddOccurrences++;
        }

        return numOddOccurrences  <= 2;
    }


    /**
     * get the java version that is running the current program
     *
     * @return string containing the java version running the current program
     */
    private static String getJavaVersion() {
        Runtime.Version runTimeVersion = Runtime.version();
        return String.format("%s.%s.%s.%s", runTimeVersion.feature(), runTimeVersion.interim(), runTimeVersion.update(), runTimeVersion.patch());
    }

    /**
     * Get the Junit version number that is used by the unit tests in this project.
     *
     * @return String containing the JUnit version number.
     */
    private static String getJUnitVersion() {
        return org.junit.jupiter.api.Test.class.getPackage().getImplementationVersion();
    }
}
