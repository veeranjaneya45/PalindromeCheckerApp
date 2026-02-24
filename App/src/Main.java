/**
 * ===============================================================
 * MAIN CLASS – UseCase11PalindromeCheckerApp
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * Encapsulates palindrome logic in a PalindromeService class.
 *
 * Author  : Veeranjaneya
 * Version : 1.0
 * ===============================================================
 */

class PalindromeService {

    public boolean checkPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}

public class Main {

    public static void main(String[] args) {

        PalindromeService service = new PalindromeService();
        String input = "level";

        boolean result = service.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}