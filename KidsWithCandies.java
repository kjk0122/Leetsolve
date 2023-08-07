import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] nums = {2,3,5,1,3};
        int target = 3;
        List<Boolean> answer = kidsWithCandies(nums, target);
        System.out.println(answer);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<Boolean>(candies.length);
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }
        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= max) {
                answer.add(true);
            } else {
                answer.add(false);
            }
        }
        return answer;
    }
}