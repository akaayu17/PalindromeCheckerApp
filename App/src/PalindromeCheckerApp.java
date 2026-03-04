import java.util.*;

/**
 * main class - use case palindrome app
 *
 * use case 9:Recursive Palindrome checker
 *
 * Description:
 * this class validates the palindrome using Call Stack
 *
 *  the application:
 *  intialize start and end index of the string
 *  checks the element of starting index and ending index recursively
 *  displays the result
 * @author  Aayusha Kuikel
 * @version 9.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "level";
       int start = 0;
       int end = input.length()-1;
     System.out.println("input: "+input);
        System.out.println("is Palindrome? :"+isPalindrome(input,start,end));

        System.out.println("\nResults:");
        System.out.println("Two Pointer Result: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack Result: " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Deque Result: " + result3 + " | Time: " + time3 + " ns");

        sc.close();
    }

    public static boolean twoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean stackMethod(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        for (char c : str.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static boolean dequeMethod(String str) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}