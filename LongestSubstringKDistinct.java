import java.util.HashSet;
import java.util.Set;

public class LongestSubstringKDistinct {
    public static String findLongestSubstringKDistinct(String s, int k) {
        int n = s.length();
        if (n == 0 || k > n) {
            return s;
        }
        int[] charCount = new int[128];
        Set<Character> distinctChars = new HashSet<>();
        int start = 0, finish = 0;
        int maxLength = 0;
        int maxStart = 0;
        while (finish < n) {
            char endChar = s.charAt(finish);
            distinctChars.add(endChar);
            charCount[endChar]++;
            while (distinctChars.size() > k) {
                char startChar = s.charAt(start);
                charCount[startChar]--;
                if (charCount[startChar] == 0) {
                    distinctChars.remove(startChar);
                }
                start++;
            }
            if (finish - start + 1 > maxLength) {
                maxLength = finish - start + 1;
                maxStart = start;
            }
            finish++;
        }

        return s.substring(maxStart, maxStart + maxLength);
    }

    public static void main(String[] args) {
        String s = "abcbdbdbbdcdabd";

        int k = 2;
        System.out.println("Longest substring with " + k + " distinct characters is: " + findLongestSubstringKDistinct(s, k));

        k = 3;
        System.out.println("Longest substring with " + k + " distinct characters is: " + findLongestSubstringKDistinct(s, k));

        k = 5;
        System.out.println("Longest substring with " + k + " distinct characters is: " + findLongestSubstringKDistinct(s, k));
    }
}
