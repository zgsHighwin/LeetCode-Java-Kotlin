package number;

/**
 * url:https://leetcode-cn.com/problems/maximum-69-number/
 * Author:Savannah
 * Description:
 * 1323. 6 和 9 组成的最大数字
 * 给你一个仅由数字 6 和 9 组成的正整数 num。
 * <p>
 * 你最多只能翻转一位数字，将 6 变成 9，或者把 9 变成 6 。
 * <p>
 * 请返回你可以得到的最大数字。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：num = 9669
 * 输出：9969
 * 解释：
 * 改变第一位数字可以得到 6669 。
 * 改变第二位数字可以得到 9969 。
 * 改变第三位数字可以得到 9699 。
 * 改变第四位数字可以得到 9666 。
 * 其中最大的数字是 9969 。
 * 示例 2：
 * <p>
 * 输入：num = 9996
 * 输出：9999
 * 解释：将最后一位从 6 变到 9，其结果 9999 是最大的数。
 * 示例 3：
 * <p>
 * 输入：num = 9999
 * 输出：9999
 * 解释：无需改变就已经是最大的数字了。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= num <= 10^4
 * num 每一位上的数字都是 6 或者 9 。
 * 通过次数10,898提交次数14,501
 * LeetCodeTesting 7/3/20
 */
public class _1323_6_和_9_组成的最大数字 {
    public static int maximum69Number(int num) {
        String numStr = String.valueOf(num);
        StringBuilder builder = new StringBuilder();
        char[] chars = numStr.toCharArray();
        int divide = 0;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '6') {
                builder.append('9');
                divide = ++i;
                break;
            }
            builder.append(c);
        }
        if (divide != 0) {
            builder.append(numStr.substring(divide));
        }
        return Integer.parseInt(builder.toString());
    }

    public static void main(String[] args) {
        System.out.println(maximum69Number(9669));
        System.out.println(maximum69Number(9999));
        System.out.println(maximum69Number(6666));
        System.out.println(maximum69Number(9696969));
    }
}
