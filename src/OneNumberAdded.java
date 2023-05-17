import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 * User: joniyed
 * Date: ১৭/৫/২৩
 * Time: ৬:০৮ PM
 * Email: joniyed.bhuiyan@gmail.com
 */
public class OneNumberAdded {

    public static int[] convertToArray(BigInteger number) {
        String numberString = number.toString();
        int[] array = new int[numberString.length()];

        for (int i = 0; i < numberString.length(); i++) {
            array[i] = Character.getNumericValue(numberString.charAt(i));
        }

        return array;
    }

    public static int[] plusOne(int[] arr) {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i];
        }
        return convertToArray(new BigInteger(s).add(new BigInteger("1")));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        int[] arr1 = new int[]{9, 9};
        int[] ints = plusOne(arr1);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
