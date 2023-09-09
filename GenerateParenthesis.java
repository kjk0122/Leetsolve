import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n = 3;
        List<String> Parenthesis = generateParenthesis(n);
        System.out.println(Parenthesis);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParentheses(result, "", 0, 0, n);
        return result;
    }

    private static void generateParentheses(List<String> result, String current, int open, int close, int n) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }
        if (open < n) {
            generateParentheses(result, current + '(', open + 1, close, n);
        }
        if (close < open) {
            generateParentheses(result, current + ')', open, close + 1, n);
        }
    }
}