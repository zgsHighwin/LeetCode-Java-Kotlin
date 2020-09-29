package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;

/**
 * url:https://leetcode-cn.com/problems/keyboard-row/
 * Author:Savannah
 * Description:
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
 * <p>
 *  
 * <p>
 * <p>
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入: ["Hello", "Alaska", "Dad", "Peace"]
 * 输出: ["Alaska", "Dad"]
 *  
 * <p>
 * 注意：
 * <p>
 * 你可以重复使用键盘上同一字符。
 * 你可以假设输入的字符串将只包含字母。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/keyboard-row
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/22/20
 */
public class _500_键盘行 {

    public  static String[] findWords(String[] words) {
        String reg = "(^[(Q|q)(W|w)(E|e)(R|r)(t|T)(Y|y)(U|u)(I|i)(O|o)(P|p)]+$)|(^[(A|a)(S|s)(D|d)(F|f)(G|g)(H|h)(J|j)(K|k)(L|l)]+$)|(^[(Z|z)(X|x)(C|c)(V|v)(B|b)(N|n)(M|m)]+$)";
        String[] strings = new String[words.length];
        Pattern p = Pattern.compile(reg);
        int j = 0;
        for (String word : words) {
            if (p.matcher(word).matches()) {
                strings[j] = word;
                j++;
            }
        }
        return Arrays.copyOf(strings, j);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"})));
    }
}
