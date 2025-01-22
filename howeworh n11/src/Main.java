import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = "{([]())}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();


        for (char c : s.toCharArray()) {

            if (isOpeningBracket(c)) {
                stack.push(c);
            }

            else if (isClosingBracket(c)) {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }


        return stack.isEmpty();
    }

    private static boolean isOpeningBracket(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    private static boolean isClosingBracket(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }
}
