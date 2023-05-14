import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: joniyed
 * Date: ১৩/৫/২৩
 * Time: ১০:০৮ PM
 * Email: joniyed.bhuiyan@gmail.com
 */
public class RomanToInteger {

    public static int romanToInt(String s) {
        int[] table = new int[256];
        table['I'] = 1;
        table['V'] = 5;
        table['X'] = 10;
        table['L'] = 50;
        table['C'] = 100;
        table['D'] = 500;
        table['M'] = 1000;

        int value = 0;
        int prev = 0;
        int current;
        for (char c : s.toCharArray()) {
            current = table[c];
            if (prev < current) {
                value -= 2 * prev;
            }
            value += current;
            prev = current;
        }
        return value;
    }

    public static void main(String[] args) {
        String s = "LVIII";
        System.out.println(romanToInt(s));
    }
}
