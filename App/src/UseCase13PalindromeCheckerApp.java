import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Two-pointer approach
    public static boolean twoPointerCheck(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Stack approach
    public static boolean stackCheck(String text) {

        Stack<Character> stack = new Stack<>();

        for (char c : text.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";

        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return text.equals(reversed);
    }

    // Method 3: StringBuilder reverse
    public static boolean builderCheck(String text) {

        String reversed = new StringBuilder(text).reverse().toString();

        return text.equals(reversed);
    }

    public static void main(String[] args) {

        String word = "racecar";

        long start, end;

        // Two-pointer test
        start = System.nanoTime();
        boolean result1 = twoPointerCheck(word);
        end = System.nanoTime();
        System.out.println("Two-Pointer Result: " + result1);
        System.out.println("Execution Time: " + (end - start) + " ns\n");

        // Stack test
        start = System.nanoTime();
        boolean result2 = stackCheck(word);
        end = System.nanoTime();
        System.out.println("Stack Result: " + result2);
        System.out.println("Execution Time: " + (end - start) + " ns\n");

        // StringBuilder test
        start = System.nanoTime();
        boolean result3 = builderCheck(word);
        end = System.nanoTime();
        System.out.println("StringBuilder Result: " + result3);
        System.out.println("Execution Time: " + (end - start) + " ns\n");
    }
}