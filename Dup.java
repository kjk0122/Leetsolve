import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Dup {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 4, 5};
        List<Integer> duplicates = findDuplicates(nums);
        System.out.println(duplicates);
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                result.add(num);
            } else {
                set.add(num);
            }
        }
        return result;
    }
}