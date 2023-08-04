import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] nums = {11, 7, 11, 2};
        int target = 9;
        List<Boolean>[] answer = kidsWithCandies(nums, target);
        System.out.println(Arrays.toString(answer));
    }

    public static List<Boolean>[] kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) > max) {

            } else {

            }
        }

        return new List[]{}; // 답 없음;;
    }
}