import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class One {
    public static void main(String[] args) {
        String[] teamIDs = {"dd", "cc", "hr"};
        String[] additional = {"ad", "sad", "dd", "ade", "sdd"};
        int n = 10;
        int[][] arr = {{1, 2}, {3, 4}, {3, 6}, {5, 5}};
        System.out.println(solution2(teamIDs, additional));
        System.out.println(solution3(10));
        System.out.println(solution4(arr));
    }

    public static int solution1(String s) {
        int answer = 0;
        int count = 1;//answer는 답, count는 알파벳 세는 것

        ArrayList al = new ArrayList(); // 정렬
        for (int i = 0; i < s.length(); i++) {
            al.add(s.charAt(i));
            Collections.sort(al);
        }

        for (int i = 0; i < al.size(); i++) {
            if (i == al.size() - 1) { //빠져나오게 하기 위해 별도로 if문 추가
                if (count % 2 == 1) { //홀수개인가? 맞으면 답 카운트
                    answer++;
                }
                break;
            }

            if (al.get(i) == al.get(i + 1)) {
                count++;
            } else {
                if (count % 2 == 1) { //홀수개인가? 맞으면 답 카운트
                    answer++;
                }
                count = 1;
            }
        }

        return answer;
    }

    public static String[] solution2(String[] teamIDs, String[] additional) {
        LinkedHashSet<String> LHS = new LinkedHashSet<>();
        for (int i = 0; i < teamIDs.length; i++) {
            LHS.add(teamIDs[i]);
        }
        for (int i = 0; i < additional.length; i++) {
            LHS.add(additional[i]);
        }
        for (int i = 0; i < teamIDs.length; i++) {
            LHS.remove(teamIDs[i]);
        }
        String[] answer = new String[LHS.size()];
        LHS.toArray(answer);

        return answer;
    }

    public static int solution3(int n) {
        int n5 = 0;
        while (n >= 5) {
            n5 += n / 5;
            n /= 5;
        }
        return n5;
    }

    public static int solution4(int[][] arr) {
        //끝 시간 정렬
        Arrays.sort(arr, (o1, o2) -> {
            if(o1[1]==o2[1]){
                return o1[0]-o2[0];
            }
            return o1[1]-o2[1];
        });

        int count=0; int et=0;
        for(int i=0;i<arr.length;i++){
            if(et<=arr[i][0]){
                count++;
            et=arr[i][1]; //새로운 타임 교체
            }
        }

        return count;
    }
}