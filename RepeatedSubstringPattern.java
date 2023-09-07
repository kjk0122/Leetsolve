public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        String input = "ABCDABCABC";
        System.out.println(repeatedSubstringPattern(input));
    }

    public static boolean repeatedSubstringPattern(String s) { //숫자와 알파벳을 추려주는 것
        String doubled = s + s;

        String sub = doubled.substring(1, doubled.length() - 1);
        System.out.println("Doubled의 값: "+doubled);
        System.out.println("sub의 값: "+sub);
        return sub.contains(s);
    }
}
