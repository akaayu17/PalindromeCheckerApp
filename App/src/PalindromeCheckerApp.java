
public class PalindromeCheckerApp {
    /**
     * Description:
     * This class validates a palindrome by converting * the string into a character array and comparing * characters using the two-pointer technique.
     * At this stage, the application:
     *
     Converts string to char array
     * Uses start and end pointers
     * Compares characters efficiently
     * Displays the result
     * This reduces extra memory usage.
     *
     * @author Aayusha Kuikel
     * @Version 4.0
     */

    public static void main(String[] args) {


        String str = "madam";
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            if (arr[start++] != arr[end--]) {
                System.out.println(" the given string " + str + " is not palindrome ");
                return;
            }
        }
        System.out.println(" The given string " + str + " is palindrome ");
    }
}

