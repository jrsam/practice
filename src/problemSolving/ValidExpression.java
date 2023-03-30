package problemSolving;

import java.util.Stack;

public class ValidExpression {

    public static void main(String[] args) {
        String[] inputs = new String[]{"(){}[]", "({}[]", "({}[", "{{}}", "]["};
        for (String input : inputs) {
            System.out.println(input + " " + isValidExpression(input));
        }
    }

    private static boolean isValidExpression(String input) {
        Stack<Character> expression = new Stack<>();

        for (char letter : input.toCharArray()) {
            switch (letter) {
                case '{':
                case '[':
                case '(':
                    expression.push(letter);
                    break;
                case '}':
                    if (expression.isEmpty() || expression.pop() != '{')
                        return false;
                    break;
                case ')':
                    if (expression.isEmpty() || expression.pop() != '(')
                        return false;
                    break;
                case ']':
                    if (expression.isEmpty() || expression.pop() != '[')
                        return false;
                    break;
            }

        }
        return expression.isEmpty();
    }
}
