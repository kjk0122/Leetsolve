import java.util.ArrayList;
import java.util.List;

public class Generate {
    public static void main(String[] args) {
        int numRows = 9;
        System.out.println(generate(numRows));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>(numRows);

        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>(i + 1); // 현재 줄의 크기만큼 배열 생성

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    temp.add(1); // 맨 처음과 맨 끝은 항상 1
                } else {
                    // 이전 줄에서 해당 위치의 두 숫자를 더해서 값을 계산
                    int val = answer.get(i - 1).get(j - 1) + answer.get(i - 1).get(j);
                    temp.add(val);
                }
            }

            answer.add(temp);
        }

        return answer;
    }


}