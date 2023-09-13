public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] cost = {1, 2, 3};
        int answer = removeDuplicates(cost);
        System.out.println(answer);
    }

    public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}