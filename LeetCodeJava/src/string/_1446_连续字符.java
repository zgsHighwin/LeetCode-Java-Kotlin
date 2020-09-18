package string;

/**
 * url:https://leetcode-cn.com/problems/consecutive-characters/
 * Author:Savannah
 * Description:
 * 给你一个字符串 s ，字符串的「能量」定义为：只包含一种字符的最长非空子字符串的长度。
 * <p>
 * 请你返回字符串的能量。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "leetcode"
 * 输出：2
 * 解释：子字符串 "ee" 长度为 2 ，只包含字符 'e' 。
 * 示例 2：
 * <p>
 * 输入：s = "abbcccddddeeeeedcba"
 * 输出：5
 * 解释：子字符串 "eeeee" 长度为 5 ，只包含字符 'e' 。
 * 示例 3：
 * <p>
 * 输入：s = "triplepillooooow"
 * 输出：5
 * 示例 4：
 * <p>
 * 输入：s = "hooraaaaaaaaaaay"
 * 输出：11
 * 示例 5：
 * <p>
 * 输入：s = "tourist"
 * 输出：1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/consecutive-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/11/20
 */
public class _1446_连续字符 {
    public static int maxPower(String s) {
        char[] chars = s.toCharArray();
        int maxNumber = 1;//最大长度
        int count = 1;//当前的个数
        int cChar = chars[0];//当前的字符
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != cChar) {
                count = 1;
                cChar = chars[i];
                continue;
            }
            count++;
            if (count > maxNumber) {
                maxNumber = count;
            }
        }
        return maxNumber;
    }

    public static void main(String[] args) {
        System.out.println(maxPower("hooraaaaaaaaaaay"));


    }
}
