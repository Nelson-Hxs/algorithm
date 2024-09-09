package xhtx;

/**
 * @author hjw
 * @date 2024/09/06 16:52
 * @description 1768.交替合并字符串
 * 给你两个字符串 word1 和 word2 。请你从 word1 开始，通过交替添加字母来合并字符串。如果一个字符串比另一个字符串长，就将多出来的字母追加到合并后字符串的末尾。返回 合并后的字符串 。
 */
public class AlternateMergeString_1768 {

    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab", "pqrs"));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] wordArray1 = word1.toCharArray();
        char[] wordArray2 = word2.toCharArray();
        int length = word1.length() <= word2.length() ? word1.length() : word2.length();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(wordArray1[i]);
            stringBuilder.append(wordArray2[i]);
        }
        if (length == word1.length()) {
            stringBuilder.append(word2.substring(length));
        } else if (length == word2.length()) {
            stringBuilder.append(word1.substring(length));
        }

        return stringBuilder.toString();
    }

}
