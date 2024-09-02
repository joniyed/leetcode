import java.util.*;

/**
 * Project: leetcode
 * Author: Joniyed Bhuiyan
 * Email: joniyed.bhuiyan@gmail.com
 * Date: 2/9/24
 * Day & Time: Monday, 9:27 AM
 */

public class TwoSum {

    public static int[] twoSumWithMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static int[] twoSumWithTwoPointer(int[] nums, int target) {

        // Convert the array to a List to keep track of the original indices
        List<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            numsList.add(num);
        }

        Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] == target) {
                return new int[]{numsList.indexOf(nums[i]), numsList.indexOf(nums[j])};
            } else if (nums[i] + nums[j] > target) {
                j--;
            } else {
                i++;
            }
        }
        return null;
    }

    public static int[] twoSumWithBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("Brute Force: " + Arrays.toString(twoSumWithBruteForce(new int[]{1, 2, 6, 3}, 5)));
        System.out.println("Two Pointer: " + Arrays.toString(twoSumWithTwoPointer(new int[]{1, 2, 6, 3}, 5)));
        System.out.println("Map: " + Arrays.toString(twoSumWithMap(new int[]{1, 2, 6, 3}, 5)));
    }

}
