import java.util.Arrays;
import java.util.Collections;

public class FindKthLargest {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k=2;
        System.out.println(findKthLargest(nums,k));
    }

    public static int findKthLargest(int[] nums, int k) {
        //중복들 다 제거하자.
        Integer[] numss=Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numss, Collections.reverseOrder());
        int ans = numss[k-1];
        return ans;
    }
}