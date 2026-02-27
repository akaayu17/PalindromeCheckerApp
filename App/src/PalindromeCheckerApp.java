import java.sql.SQLOutput;
import java.util.Stack;

public class PalindromeCheckerApp {
    /**
     * Use Case 5: Stack Based Palindrome Checker
     Description:
     * This class validates a palindrome using a Stack
     * data structure which follows the LIFO principle.
     *
     * At this stage, the application:
     * - Pushes characters into a stack
     * - Pops them in reverse order
     * - Compares with original sequence
     * - Displays the result

     * This maps stack behavior to reversal Logic.
     *
     * @author Aayusha Kuikel
     * @Version 4.0
     */

    public static void main(String[] args) {
        Stack<Character> str = new Stack<>();
        String string="aayusha";
        for(char c: string.toCharArray()){
            str.push(c);
        }

        for(char c: string.toCharArray()){
            if(c!=str.pop()){

                System.out.println("The string"+ str + " is not palindrome");

            return;
            }
            System.out.println("The string " + str + " is palindrome");
        }


    }
}

