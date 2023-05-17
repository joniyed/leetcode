import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 * User: joniyed
 * Date: ১৭/৫/২৩
 * Time: ১১:১৭ PM
 * Email: joniyed.bhuiyan@gmail.com
 */
public class AddBinaryString {
    public static String add(String a, String b) {
        return (new BigInteger(a, 2).add(new BigInteger(b, 2))).toString(2);
    }

    public static void main(String[] args) {
        System.out.println(add("11", "11"));
    }
}
