import java.util.Arrays;
import java.util.HashMap;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {11, 7, 9, 8, 9, 88, 99, 11, 2};
        int val = 9;
        int answer = removeElement(nums, val);
        System.out.println(answer);
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}