import java.util.Arrays;
import java.util.HashMap;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String nums = "sdds fsfs";
        int answer = lengthOfLastWord(nums);
        System.out.println(answer);
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        String[] arr =  s.split("\\s+");

        return arr[arr.length-1].length();
    }
}