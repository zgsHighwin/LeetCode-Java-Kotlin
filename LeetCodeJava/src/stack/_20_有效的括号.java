package stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * url:https://leetcode-cn.com/problems/valid-parentheses/
 * Author:Savannah
 * Description:
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/18/20
 */
public class _20_有效的括号 {
    public  static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        char[] chars = s.toCharArray();

        for (char c : chars) {

            if (stack.isEmpty()) {
                if (map.containsKey(c)) {
                    return false;
                } else stack.push(c);
                continue;
            }

            Character peek = stack.peek();
            if (!map.containsKey(c)) {
                stack.push(c);
            } else {
                Character character = map.get(c);
                if (character == peek) {
                    stack.pop();
                } else return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("([])[]}"));

    }
}
