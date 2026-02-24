/**
 * ===============================================================
 * MAIN CLASS – UseCase6PalindromeCheckerApp
 * ===============================================================
 * Use Case 6: Queue + Stack Palindrome Checker
 *
 * Description:
 * This program checks whether a given string is a palindrome
 * using two data structures:
 * 1. Queue  (FIFO – First In First Out)
 * 2. Stack  (LIFO – Last In First Out)
 *
 * Characters are inserted into both structures and then
 * compared by removing from queue front and stack top.
 * If all characters match → String is Palindrome.
 *
 * Author  : Veeranjaneya
 * Version : 1.0
 * ===============================================================
 */

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // Define input string to validate
        String input = "civic";

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Insert characters into Queue and Stack
        for(char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare Queue dequeue with Stack pop
        while(!queue.isEmpty()) {
            if(queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}