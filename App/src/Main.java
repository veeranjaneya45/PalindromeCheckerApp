/**
 * ===============================================================
 * MAIN CLASS – UseCase8PalindromeCheckerApp
 * ===============================================================
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a Singly Linked List.
 *
 * Flow:
 * 1. Convert string to linked list
 * 2. Find middle using fast & slow pointers
 * 3. Reverse second half of list
 * 4. Compare both halves
 *
 * Key Concepts:
 * - Singly Linked List
 * - Node Traversal
 * - Fast & Slow Pointer Technique
 * - In-Place Reversal
 *
 * Author  : Veeranjaneya
 * Version : 1.0
 * ===============================================================
 */

class Node {
    char data;
    Node next;

    Node(char data) {
        this.data = data;
        this.next = null;
    }
}

public class Main {

    // Function to check palindrome
    public static boolean isPalindrome(Node head) {

        if (head == null || head.next == null)
            return true;

        Node slow = head;
        Node fast = head;

        // Find middle
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Reverse second half
        Node secondHalf = reverse(slow.next);

        Node firstHalf = head;
        Node temp = secondHalf;

        // Compare halves
        while (temp != null) {
            if (firstHalf.data != temp.data)
                return false;
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        return true;
    }

    // Reverse linked list
    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {

        String input = "madam";

        // Convert string to linked list
        Node head = null, tail = null;

        for (char c : input.toCharArray()) {
            Node newNode = new Node(c);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        boolean result = isPalindrome(head);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}