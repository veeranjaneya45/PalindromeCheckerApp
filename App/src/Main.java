/**
 * ===============================================================
 * MAIN CLASS – UseCase7PalindromeCheckerApp
 * ===============================================================
 * Use Case 7: Deque Based Optimized Palindrome Checker
 *
 * Author  : Veeranjaneya45
 * Version : 1.0
 * ===============================================================
 */

import java.util.*;

public class Main{

    public static void main(String[] args) {

        String input = "refer";

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}