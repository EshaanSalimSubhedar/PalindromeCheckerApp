public class UseCase9PalindromeCheckerApp {

    // Recursive method to check palindrome
    static boolean isPalindrome(String text, int start, int end) {

        // Base case
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindrome(text, start + 1, end - 1);
    }

    public static void main(String[] args) {

        String word = "madam";

        boolean result = isPalindrome(word, 0, word.length() - 1);

        if (result) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}