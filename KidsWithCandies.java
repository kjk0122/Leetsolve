import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] nums = {2,3,5,1,3};
        int target = 3;
        List<Boolean> answer = kidsWithCandies(nums, target);
        System.out.println(answer);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // 현재 가장 많은 사탕 개수를 찾습니다.
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        List<Boolean> result = new ArrayList<>();

        // 각 어린이에게 추가 사탕을 주고 나서 가장 많은 사탕을 가지게 되는지 판단합니다.
        for (int candy : candies) { //향상된 for문 기억하자...자꾸 까먹어 진짜...
            result.add(candy + extraCandies >= maxCandies);
        }

        return result;
    }
}