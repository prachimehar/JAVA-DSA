package Arrays;

import java.util.*;

public class ThreeSum{

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();

        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int c = -(nums[i] + nums[j]);

                if (seen.contains(c)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], c);
                    Collections.sort(triplet);
                    result.add(triplet);
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};

        System.out.println(threeSum(nums));
    }
}
