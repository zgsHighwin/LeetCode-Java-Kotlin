package string;

/**
 * url:https://leetcode-cn.com/problems/reverse-only-letters/
 * Author:Savannah
 * Description:
 * 给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入："ab-cd"
 * 输出："dc-ba"
 * 示例 2：
 * <p>
 * 输入："a-bC-dEf-ghIj"
 * 输出："j-Ih-gfE-dCba"
 * 示例 3：
 * <p>
 * 输入："Test1ng-Leet=code-Q!"
 * 输出："Qedo1ct-eeLg=ntse-T!"
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-only-letters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/11/20
 */
public class _917_仅仅反转字母 {
    public static String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int l = 0;
        int r = chars.length - 1;
        while (l < r) {
            char lChar = chars[l];
            if (!Character.isLetter(lChar)) {
                l++;
                continue;
            }
            char rChar = chars[r];
            if (!Character.isLetter(rChar)) {
                r--;
                continue;
            }

            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;

            l++;
            r--;
        }
        return new String(chars, 0, chars.length);
    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));

    }
}
