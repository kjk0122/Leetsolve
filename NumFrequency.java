import java.util.HashMap;
import java.util.Map;

public class NumFrequency {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 3, 3, 4};
        int[] array2 = {1, 1, 2, 2};
        int[] array3 = {1};

        System.out.println(solution(array1)); // 예상 결과: 3
        System.out.println(solution(array2)); // 예상 결과: -1
        System.out.println(solution(array3)); // 예상 결과: 1
    }

    public static int solution(int[] array) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // 배열 내 각 숫자의 빈도수 계산
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;
        int mode = -1;

        // 최빈값 찾기
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int currentFrequency = entry.getValue();
            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                mode = entry.getKey();
            } else if (currentFrequency == maxFrequency) {
                // 최빈값이 여러 개인 경우 -1 반환
                mode = -1;
            }
        }

        return mode;
    }
}