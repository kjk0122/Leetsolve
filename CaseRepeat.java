import java.util.Arrays;
import java.util.stream.IntStream;

public class CaseRepeat {
    public static void main(String[] args) {
        String my_string="wewe";
        int n = 2;
        String letter="w";
        System.out.println(caseRepeat(my_string,n));
        System.out.println(stringRemove(my_string,letter));
    }

    public static String caseRepeat(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<my_string.length();i++){
        String x= String.valueOf(my_string.charAt(i));
        x=x.repeat(n);
        sb.append(x);
        }
        return sb.toString();
    }
//replace([기존문자],[바꿀문자])
//    a= a.replace("대한",    "민국");
    public String caseRepeat2(String my_string, int n) {
        return my_string.repeat(n);
    }
    public static String stringRemove(String my_string, String letter) {
        return my_string.replace(letter,"");
    }

    public static int[] stream(int[] numList) {
        return IntStream.of((int) Arrays.stream(numList).filter(i -> i % 2 == 0).count(), (int) Arrays.stream(numList).filter(i -> i % 2 == 1).count()).toArray();
    }
}