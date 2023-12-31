import java.util.HashMap;
import java.util.Map;

public class Rometoint {
    public static void main(String[] args) {
        String s ="CI";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int answer=0;
        Map<Character, Integer> m = new HashMap<>();
        m.put('I', 1); m.put('V', 5);
        m.put('X', 10); m.put('L', 50);
        m.put('C', 100); m.put('D', 500);
        m.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))) {// 4,9 판독을 위함
                answer -= m.get(s.charAt(i));
            } else {
                answer += m.get(s.charAt(i));
            }
        }
    return answer;
    }
}