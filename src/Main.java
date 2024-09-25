import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;

public class Main {

    public static void main(String[] args) {
        System.out.format("Java version: %s%n", getJavaVersion());
        System.out.format("JUnit version: %s%n", getJUnitVersion());

    }

    public static boolean canMakePalindromeStillDoesNotWork(String s) {
        int numDeletions = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                numDeletions++;
            }
        }
        return numDeletions <= 1;
    }

    public static boolean canMakePalindromeDoesNotWork(String s) {
        int count = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (Character ch : s.toCharArray()) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        for (Character ch : hm.keySet()) {
            if (hm.get(ch) % 2 != 0) {
                count++;
                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }



    // Utility method to check if
    // substring from low to high is
    // palindrome or not.
    public static boolean isPalindrome(String str,
                                int low, int high)
    {
        while (low < high)
        {
            if (str.charAt(low) != str.charAt(high))
                return false;
            low++;
            high--;
        }
        return true;
    }

    /**
     * Determines if the specified string can be made into a palindrome by removing at most
     * one character.
     *
     * @param str
     * @return true if the word can be made into a palindrome; otherwise, returns false.
     * @implNote We use a dictionary to count characters.  If only one character has a odd number of occurrences,
     * we know we can remove that character and still make the remaining characters into a palindrome.
     * <p>
     * Example 1: raycecar => true
     * Example 2: abxa => true
     */
    public static boolean canMakePalindrome(String str) {
        // don't waste time on words that are already a palindrome.
        if ( str.length() < 2 ) return true;

        // Initialize low and right
        // by both the ends of the string
        int low = 0, high = str.length() - 1;

        // loop until low and
        // high cross each other
        while (low < high)
        {

            // If both characters are equal then
            // move both pointer towards end
            if (str.charAt(low) == str.charAt(high))
            {
                low++;
                high--;
            }
            else
            {

                /*
                 * If removing str[low] makes the
                 * whole string palindrome. We basically
                 * check if substring str[low+1..high]
                 * is palindrome or not.
                 */
                if (isPalindrome(str, low + 1, high))
                    return true;

                /*
                 * If removing str[high] makes the whole string
                 * palindrome. We basically check if substring
                 * str[low+1..high] is palindrome or not.
                 */
                if (isPalindrome(str, low, high - 1))
                    return true;

                return false;
            }
        }

        // We reach here when complete string
        // will be palindrome if complete string
        // is palindrome then return mid character
        return true;

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
