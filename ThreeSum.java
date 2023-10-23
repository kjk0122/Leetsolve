import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> answer = threeSum(nums);
        print2DList(answer);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> container = new ArrayList<>();
                        container.add(nums[i]);
                        container.add(nums[j]);
                        container.add(nums[k]);
                        result.add(container);
                    }
                }
            }
        }
        return result;
    }
    public static List<List<Integer>> threeSum2(int[] nums) {
        Arrays.sort(nums); // Sorted Array
        List<List<Integer>> answer = new ArrayList<>();

        if (nums.length < 3) {
            return answer;
        }

        if (nums[0] > 0) {
            return answer;
        }

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            hashMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length - 2; ++i) {
            if (nums[i] > 0) {
                break;
            }

            for (int j = i + 1; j < nums.length - 1; ++j) {
                int required = -1 * (nums[i] + nums[j]);
                if (hashMap.containsKey(required) && hashMap.get(required) > j) {
                    answer.add(Arrays.asList(nums[i], nums[j], required));
                }
                j = hashMap.get(nums[j]);
            }

            i = hashMap.get(nums[i]);
        }

        return answer;
    }
    public static void print2DList(List<List<Integer>> twoDList) {
        for (List<Integer> row : twoDList) {
            for (Integer num : row) {
                System.out.print(num + " "); // 각 요소 출력 후 공백 추가
            }
            System.out.println(); // 행의 끝에 개행 문자 추가
        }
    }
}