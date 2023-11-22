import java.util.Arrays;

public class NumFactorial {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(int n) {
        // n 이하의 홀수가 오름차순으로 담긴 배열을 반환

        int[] answer = new int[(n / 2) + (n % 2)]; // 홀수의 갯수로 배열 크기 설정

        int j = 1;
        for (int i = 0; j < n; i++) {
            answer[i] = j;
            j += 2;
        }

        return answer;
    }
}