import java.util.stream.IntStream;

public class Search {
    public static void main(String[] args) {
        int[] nums = {3, 5, 6, 0, 0, 1, 4};
        int target = 2;
       System.out.println(search(nums, target));
    }

    public static boolean search(int[] nums, int target) {
        return IntStream.of(nums).anyMatch(x -> x == target);
    }
}