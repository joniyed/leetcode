import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: joniyed
 * Date: ১৪/৫/২৩
 * Time: ৪:৫৬ PM
 * Email: joniyed.bhuiyan@gmail.com
 */

class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEndOfWord;

    TrieNode() {
        children = new HashMap<>();
        isEndOfWord = false;
    }
}

class Trie {
    TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    void insert(String word) {
        TrieNode current = root;
        for (char c : word.toCharArray()) {
            current.children.putIfAbsent(c, new TrieNode());
            current = current.children.get(c);
        }
        current.isEndOfWord = true;
    }

    String getLongestCommonPrefix() {
        StringBuilder prefix = new StringBuilder();
        TrieNode current = root;
        while (current != null && current.children.size() == 1 && !current.isEndOfWord) {
            char nextChar = current.children.keySet().iterator().next();
            prefix.append(nextChar);
            current = current.children.get(nextChar);
        }
        return prefix.toString();
    }
}

public class LongestCommonPrefix {

    public static String find(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return str1.substring(0, i);
            }
        }
        return str1;
    }

    public static String longestCommonPrefix(String[] arr) {
        Arrays.sort(arr);
        String str1 = arr[0];
        String str2 = arr[arr.length - 1];
        return find(str1, str2);
    }

    public static void main(String[] args) {
        String[] strs = new String[]{"aaa", "aa", "aaa"};
        String prefix = strs[0];
        for(int i = 1; i < strs.length; i++) {
            while(!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        System.out.println(prefix);
    }
}
