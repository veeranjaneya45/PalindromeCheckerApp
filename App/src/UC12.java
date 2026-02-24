/**
 * ===============================================================
 * MAIN CLASS – UseCase12PalindromeCheckerApp
 * Use Case 12: Strategy Pattern for Palindrome Algorithms
 *
 * Author  : Veeranjaneya
 * Version : 1.0
 * ===============================================================
 */

import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String input);
}

// Stack Strategy
class StackStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray())
            stack.push(c);

        for (char c : input.toCharArray())
            if (c != stack.pop())
                return false;

        return true;
    }
}

// Deque Strategy
class DequeStrategy implements PalindromeStrategy {
    public boolean check(String input) {
        Deque<Character> dq = new ArrayDeque<>();
        for (char c : input.toCharArray())
            dq.addLast(c);

        while (dq.size() > 1)
            if (dq.removeFirst() != dq.removeLast())
                return false;

        return true;
    }
}

// Main App
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        PalindromeStrategy strategy;

        // choose algorithm dynamically
        strategy = new StackStrategy();
        // strategy = new DequeStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}