package string;

/**
 * url:https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 * Author:Savannah
 * Description:
 * <p>
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 * <p>
 * LeetCodeTesting 7/3/20
 */
public class _剑指_Offer_05_替换空格 {
    public static String replaceSpace(String s) {
        StringBuilder builder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (Character.isSpaceChar(c)) {
                builder.append("%20");
            } else
                builder.append(c);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }
}
