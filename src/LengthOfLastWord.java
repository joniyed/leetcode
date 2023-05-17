/**
 * Created by IntelliJ IDEA.
 * User: joniyed
 * Date: ১৭/৫/২৩
 * Time: ৯:২৯ AM
 * Email: joniyed.bhuiyan@gmail.com
 */
public class LengthOfLastWord {
    public static int LenOfLastWord(String s) {
        int index = 0;
        s = s.trim();
        for (int i = s.toCharArray().length - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                index++;
            } else {
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println((LenOfLastWord("a asdfsd")));
    }
}
