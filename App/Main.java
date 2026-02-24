/**
 * ===============================================================
 * MAIN CLASS – UseCase13PalindromeCheckerApp
 * Use Case 13: Performance Comparison
 *
 * Author  : Veeranjaneya
 * Version : 1.0
 * ===============================================================
 */

public class Main {

    public static boolean checkPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {

        String input = "level";

        long startTime = System.nanoTime();

        boolean result = checkPalindrome(input);

        long endTime = System.nanoTime();

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + (endTime - startTime) + " ns");
    }
}