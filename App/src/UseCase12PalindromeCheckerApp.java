import java.util.*;

interface PalindromeStrategy {
    boolean check(String text);
}

// Stack based strategy
class StackStrategy implements PalindromeStrategy {

    public boolean check(String text) {

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
}

// Deque based strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String text) {

        Deque<Character> deque = new LinkedList<>();

        for (char c : text.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {

            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }
}

public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "racecar";

        // Choose strategy dynamically
        PalindromeStrategy strategy;

        // Change strategy here
        strategy = new StackStrategy();
        // strategy = new DequeStrategy();

        boolean result = strategy.check(word);

        if (result) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}