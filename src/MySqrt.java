/**
 * Created by IntelliJ IDEA.
 * User: joniyed
 * Date: ১৭/৫/২৩
 * Time: ৯:৫০ PM
 * Email: joniyed.bhuiyan@gmail.com
 */
public class MySqrt {

    public static int sqrt(int x) {
        if (x < 2) {
            return x;
        }
        int lo = 2;
        int hi = x / 2;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            long sq = (long) mid * mid;
            if (sq > x)
                hi = mid - 1;
            else if (sq < x)
                lo = mid + 1;
            else
                return mid;
        }
        return hi;
    }

    public static void main(String[] args) {
        System.out.println(sqrt(1));
        System.out.println(Math.sqrt(10));
    }
}
