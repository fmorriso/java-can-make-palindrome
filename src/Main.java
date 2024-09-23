import java.util.Dictionary;
import java.util.Enumeration;
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
            if(s.charAt(i) != s.charAt(s.length() - i - 1)) {
                numDeletions++;
            }
        }
        return numDeletions <= 1;
    }

    public static boolean canMakePalindromeDoesNotWork(String s) {
        int count = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        for(Character ch : s.toCharArray()){
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }else{
                hm.put(ch, 1);
            }
        }
        for (Character ch : hm.keySet()){
            if(hm.get(ch) % 2 != 0){
                count++;
                if( count > 1) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean canMakePalindromeSecond(String word) {
        // don't waste time on words that are already a palindrome.
        if (word.length() < 2) return true;

        Dictionary<String, Integer> dictionary = new Hashtable<>();
        int numOddChars = 0;

        // scan each individual character in the word
        for (int i = 0; i < word.length(); i++) {
            String key = word.substring(i, i + 1);

            if (dictionary.get(key) == null) dictionary.put(key, 1);
            else {
                int count = dictionary.get(key) + 1;
                dictionary.put(key, count);
            }

            if (dictionary.get(key) % 2 == 0) numOddChars--;
            else numOddChars++;
        }

        return numOddChars < 2;
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

        String keyWithLowestOddCount = "";
        int lowestOddCount = Integer.MAX_VALUE;
        Enumeration<String> keys = dictionary.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            int count = dictionary.get(key);
            if(count % 2== 1 && count < lowestOddCount){
                lowestOddCount = count;
                keyWithLowestOddCount = key;
            }

        }

        // POSSIBLE FIX: find the highest odd count, such as 3 in drpepper (the 'p' count)
        // and, if that is removed, is the next highest odd count == 1?  If so, then return true
        keys = dictionary.keys();
        if(!keyWithLowestOddCount.isEmpty()){
            // remove that key/count from the dictionary
            // now check how many odd counts are left
            // if there is only one remaining odd count, then return true; otherwise, return false
            dictionary.remove(keyWithLowestOddCount);
        }

        // make a final pass through the dictionary.
        // if there are any odd count keys > 1, then return false; otherwise return true
        int numOddOccurrences = 0;
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            int count = dictionary.get(key);
            if (count > 1 && count % 2 == 1) {
                return false;
            }
        }

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
