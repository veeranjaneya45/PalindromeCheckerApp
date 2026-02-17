/**
 * ============================================================
 * MAIN CLASS – UseCase3PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 3: Reverse String Based Palindrome Check
 *
 * Description:
 * This class checks whether a string is a palindrome
 * by reversing the string and comparing it with
 * the original value.
 *
 * At this stage, the application:
 *  - Iterates the string in reverse order
 *  - Builds a reversed version
 *  - Compares original and reversed strings
 *  - Displays the validation result
 *
 * This introduces transformation-based validation.
 *
 * @author Veeranjaneya Reddy
 * @version 3.0
 * ============================================================
 */

public class UC3 {

    /**
     * Application entry point for UC3.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // ------------------------------------------------------
        // Step 1: Store a hardcoded string
        // ------------------------------------------------------
        String input = "madam";

        // ------------------------------------------------------
        // Step 2: Create empty string for reversed value
        // ------------------------------------------------------
        String reversed = "";

        // ------------------------------------------------------
        // Step 3: Iterate from last character to first
        // Example: madam → m a d a m
        // ------------------------------------------------------
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        // ------------------------------------------------------
        // Step 4: Compare original and reversed strings
        // ------------------------------------------------------
        if (input.equals(reversed))
            System.out.println(input + " is a Palindrome");
        else
            System.out.println(input + " is NOT a Palindrome");
    }
}
