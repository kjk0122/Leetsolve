import java.util.Arrays;

public class ti {


    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {31, 10, 45, 1, 6, 19};
        solution2(lottos, win_nums);
    }

    public static long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }
        return answer;
    }


    public static void solution2(int[] lottos, int[] win_nums) {
        int wild = 0;
        int win = 0;
        int[] answer = new int[2];
        for (int j = 0; j < lottos.length; j++) {
            if (lottos[j] == 0) {wild++;
            } else {
                for (int i = 0; i < win_nums.length; i++) {
                    if (lottos[j] == win_nums[i]) win++;
                }
            }
        }
       answer[0] = rank(win + wild);
       answer[1] = rank(win);
        System.out.println(Arrays.toString(answer));
    }
    public static int rank(int n){
        if(n>1){
        return 7-n;
        }else{
            return 6;
        }
    }
}
