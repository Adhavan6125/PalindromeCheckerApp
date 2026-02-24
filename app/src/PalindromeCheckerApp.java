/**
 MAIN CLASS UseCaseiPalindromeApp
 Use Case 1: Application Entry & Welcome Message
 Description:
 This class represents the entry point of the * Palindrome Checker Management System.
 At this stage, the application:
 Starts execution from the main() method
 * - Displays a welcome message
 Shows application version
 No palindrome logic is implemented yet.
 The goal is to establish a clear startup flow.
 @author Adhavan
 @version 1.0
 */
import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";
        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();
        // Add each character to the Linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }
        // Flag to track palindrome state
        boolean isPalindrome = true;
        // Compare until only one or zero elements remain
        while (list.size() > 1) {
            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input: " + input);
        System.out.println("Is Palindrome? ");
        System.out.println(isPalindrome);
    }
}