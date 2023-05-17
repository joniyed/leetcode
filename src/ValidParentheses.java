import java.util.ArrayDeque;
import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: joniyed
 * Date: ১৫/৫/২৩
 * Time: ৯:১৪ PM
 * Email: joniyed.bhuiyan@gmail.com
 */
public class ValidParentheses {
    public static boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if ((x == ')' || x == '}' || x == ']') && stack.isEmpty())
                return false;
            else if (x == '(' || x == '{' || x == '[')
                stack.push(x);
            else if (x == ')' && stack.peek() == '(')
                stack.poll();
            else if (x == ']' && stack.peek() == '[')
                stack.poll();
            else if (x == '}' && stack.peek() == '{')
                stack.poll();
            else
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(]"));
    }
}
