import java.util.HashSet;
import java.util.Set;

public class aeiouIndex {

    public static void main(String[] args) {
        String s = "abcabcbb";
        int answer = aeiouIndex(s);
        System.out.println(answer);
    }
    public static int aeiouIndex(String word) {
        String index="AEIOU";
        int total=3905;

        int answer = 0;
        for(String s:word.split("")){
            total/=5;
            answer=answer+(total*index.indexOf(s))+1;
        }

        return answer;
    }
}
