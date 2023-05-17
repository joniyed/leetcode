/**
 * Created by IntelliJ IDEA.
 * User: joniyed
 * Date: ১৫/৫/২৩
 * Time: ১১:০৪ PM
 * Email: joniyed.bhuiyan@gmail.com
 */
public class RemoveDuplicatesFromSortedArray {


    public static int removeDuplicate(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                nums[k + 1] = nums[i];
                k++;
            }
        }
        return k + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicate(arr));
    }
}
