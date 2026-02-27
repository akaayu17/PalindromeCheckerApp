
public class PalindromeCheckerApp {
    /**
     * Application entry point.
     *
     * This is a Palindrome Checker using String reverse
     * @author Aayusha Kuikel
     * @Version 1.0
     */

    public static void main(String[] args){
    String str = new String ("aayusha");
    String reversed="";
    for(int i=str.length()-1; i>=0;i--) {
        reversed = reversed + str.charAt(i);
    }
    if(str.equals(reversed)){
        System.out.println("The string is palindrome.");
        return;
    }
        System.out.println("The string is not palindrome.");

    }

    }

