

/**
Use Case 11: Object-Oriented Palindrome Service

Description:
This class demonstrates palindrome validation using
        object-oriented design.

The palindrome logic is encapsulated inside a
PalindromeService class.

This improves:

Reusability
 Readability
 Separation of concerns

@author Aayusha Kuikel
@version 11.0
*/


import java.util.Stack;
import java.util.Scanner;

public class PalindromeCheckerApp {

    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < cleaned.length(); i++) {
            stack.push(cleaned.charAt(i));
        }

        for (int i = 0; i < cleaned.length(); i++) {
            if (cleaned.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // ⭐ Main method (program starts here)
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("input: ");
        String input = sc.nextLine();

        PalindromeCheckerApp obj = new PalindromeCheckerApp();

        boolean result = obj.checkPalindrome(input);

        System.out.println("is Palindrome? :" + result);

        sc.close();
    }
}