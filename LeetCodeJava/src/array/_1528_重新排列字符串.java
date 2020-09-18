package array;

/**
 * url:
 * Author:Savannah
 * Description:
 * LeetCodeTesting 9/17/20
 */
public class _1528_重新排列字符串 {
    public static String restoreString(String s, int[] indices) {
        char[] chars = s.toCharArray();
        char[] chars1 = s.toCharArray();
        System.out.println(chars == chars1);
        for (int i = 0; i < indices.length; i++) {
            chars1[indices[i]] = chars[i];
        }
        return new String(chars1);
    }

    public static void main(String[] args) {
        System.out.println(restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3}));
    }
}
