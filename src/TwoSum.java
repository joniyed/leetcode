import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Project: leetcode
 * Author: Joniyed Bhuiyan
 * Email: joniyed.bhuiyan@gmail.com
 * Date: 2/9/24
 * Day & Time: Monday, 9:27 AM
 */

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 6, 3}, 7)));
    }

}
