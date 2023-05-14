/**
 * Created by IntelliJ IDEA.
 * User: joniyed
 * Date: ১৩/৫/২৩
 * Time: ১০:০৮ PM
 * Email: joniyed.bhuiyan@gmail.com
 */
public class RomanToInteger {

    public static int romanToInt(String s){
        int value = 0;
        int prev = 0;
        int current;
        for (char c : s.toCharArray()) {
            switch (String.valueOf(c)) {
                case "I":
                    current = 1;
                    break;
                case "V":
                    current = 5;
                    break;
                case "X":
                    current = 10;
                    break;
                case "L":
                    current = 50;
                    break;
                case "C":
                    current = 100;
                    break;
                case "D":
                    current = 500;
                    break;
                default:
                    current = 1000;
                    break;
            }
            if (prev < current) {
                value -=  prev;
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
