/**
 * Created by IntelliJ IDEA.
 * User: joniyed
 * Date: ১৫/৫/২৩
 * Time: ৯:১৪ PM
 * Email: joniyed.bhuiyan@gmail.com
 */
public class FindFirstAndLastIndex {
    public static int findFirstAndLastIndex(int[] nums, int target, boolean firstI) {
        int index=-1;
        int first = 0;
        int last = nums.length - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (nums[mid] < target) {
                first = first + 1;
            } else if (nums[mid] == target) {
                index=mid;
                if(firstI){
                    last=mid-1;
                }else{
                    first=mid+1;
                }
            } else {
                last = last - 1;
            }
            mid = (first + last) / 2;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1};
        System.out.println(findFirstAndLastIndex(nums,1,true));
        System.out.println(findFirstAndLastIndex(nums,1,false));
    }
}
