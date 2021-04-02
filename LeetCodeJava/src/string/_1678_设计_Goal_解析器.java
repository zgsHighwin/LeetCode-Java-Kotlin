package string;

/**
 * url:
 * Author:Savannah
 * Description:
 * <p>
 * 请你设计一个可以解释字符串 command 的 Goal 解析器 。command 由 "G"、"()" 和/或 "(al)" 按某种顺序组成。Goal 解析器会将 "G" 解释为字符串 "G"、"()" 解释为字符串 "o" ，"(al)" 解释为字符串 "al" 。然后，按原顺序将经解释得到的字符串连接成一个字符串。
 * <p>
 * 给你字符串 command ，返回 Goal 解析器 对 command 的解释结果。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：command = "G()(al)"
 * 输出："Goal"
 * 解释：Goal 解析器解释命令的步骤如下所示：
 * G -> G
 * () -> o
 * (al) -> al
 * 最后连接得到的结果是 "Goal"
 * 示例 2：
 * <p>
 * 输入：command = "G()()()()(al)"
 * 输出："Gooooal"
 * 示例 3：
 * <p>
 * 输入：command = "(al)G(al)()()G"
 * 输出："alGalooG"
 * <p>  https://leetcode-cn.com/problems/goal-parser-interpretation/
 * LeetCodeTesting 2021/3/26
 */
public class _1678_设计_Goal_解析器 {
    public String interpret(String command) {
        if (command==null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();

        char[] chars = command.toCharArray();
        for (int i = 0; i < chars.length; ) {
            char c = chars[i];
            if (c == 'G') {
                sb.append('G');
                i++;
            }
            if (c == '(') {
                if (')' == chars[i + 1]) {
                    sb.append('o');
                    i += 2;
                } else {
                    sb.append("al");
                    i += 4;
                }
            }
        }
        return sb.toString();
    }
}
