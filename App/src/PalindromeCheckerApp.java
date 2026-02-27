
public class PalindromeCheckerApp {
    /**
     * Application entry point.
     *
     * This is a Palindrome Checker App created from Java
     * @author Aayusha Kuikel
     * @Version 1.0
     */

    public static void main(String[] args){
    String str = new String ("madama");
    boolean isPalindrome=true;
    for (int i=0; i<str.length()/2;i++){
        if(str.charAt(i)!=str.charAt(str.length()-i-1)){
            System.out.println("The string "+ str +" is not palindrome.");

            return;

        }
    }
        System.out.println("The string " + str +
                 isPalindrome);

    }
}