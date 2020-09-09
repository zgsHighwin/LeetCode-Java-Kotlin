package string;

/**
 * url:https://leetcode-cn.com/problems/to-lower-case/
 * Author:Savannah
 * Description:
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入: "Hello"
 * 输出: "hello"
 * 示例 2：
 * <p>
 * 输入: "here"
 * 输出: "here"
 * 示例 3：
 * <p>
 * 输入: "LOVELY"
 * 输出: "lovely"
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/to-lower-case
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 7/3/20
 */
public class _709_转换成小写字母 {

    public static String toLowerCase(String str) {
        StringBuilder builder = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isLetter(c)) {
                c = Character.toLowerCase(c);
            }
            builder.append(c);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello world"));
        System.out.println((int) 'A');
        System.out.println((int) 'a');
    }
}
