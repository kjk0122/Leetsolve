import java.util.HashMap;
import java.util.Map;

public class StrStr {
    public static void main(String[] args) {
        String s ="asawCIdwCIdw";
        System.out.println(strStr(s,"CId"));
    }
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}