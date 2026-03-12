public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "racecar";

        int left = 0;
        int right = word.length() - 1;

        boolean isPalindrome = true;

        while (left < right) {

            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}