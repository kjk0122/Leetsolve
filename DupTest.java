import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DupTest {
    public static void main(String[] args) {
        int sampleSize = 10; // 샘플 크기
        int maxValue = 100; // 배열에 포함될 수 있는 최대값
        int numSamples = 5; // 테스트할 샘플 개수

        Random random = new Random();

        for (int i = 0; i < numSamples; i++) {
            int[] nums = new int[sampleSize];
            for (int j = 0; j < sampleSize; j++) {
                nums[j] = random.nextInt(maxValue + 1); // 0부터 maxValue 사이의 임의의 값 생성
            }

            List<Integer> duplicates = Dup.findDuplicates(nums);
            System.out.println("Input: " + Arrays.toString(nums));
            System.out.println("Duplicates: " + duplicates);
            System.out.println();
        }
    }
}
