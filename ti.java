import java.util.HashMap;
import java.util.Map;

public class ti {


    public static void main(String[] args) {
        //"RT", "TR", "FC", "CF", "MJ", "JM", "AN", "NA"
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        System.out.println(solution(survey, choices));
    }

    public static String solution(String[] survey, int[] choices) {
        Map<String, Integer> result = new HashMap<>();
//RT CF JM AN
        result.put("R", 0);
        result.put("T", 0);
        result.put("C", 0);
        result.put("F", 0);
        result.put("J", 0);
        result.put("M", 0);
        result.put("A", 0);
        result.put("N", 0);

        for (int i = 0; i < survey.length; i++) {
            if (choices[i]<4) {
                System.out.println(survey[i].charAt(0));
            result.replace(String.valueOf(survey[i].charAt(0)),4-choices[i]);
            }else if(choices[i]>4){
                System.out.println(survey[i].substring(1));
            result.replace(survey[i].substring(1),choices[i]-4);
            }
        }
        StringBuilder answer=new StringBuilder();


        System.out.println(result);
        return "kk";
    }
}
