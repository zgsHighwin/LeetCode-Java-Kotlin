package string;

import java.lang.reflect.Array;
import java.util.*;

/**
 * url:
 * Author:Savannah
 * Description:
 * 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
 * <p>
 * 你可以按任意顺序返回答案。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：["bella","label","roller"]
 * 输出：["e","l","l"]
 * 示例 2：
 * <p>
 * 输入：["cool","lock","cook"]
 * 输出：["c","o"]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= A.length <= 100
 * 1 <= A[i].length <= 100
 * A[i][j] 是小写字母
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-common-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 2021/4/1
 */
public class _1002_查找常用字符 {
    public List<String> commonChars(String[] A) {
        List<String> list = new ArrayList<>();
        if (A.length == 1) {
            list.addAll(Arrays.asList(A));
            return list;
        }
        char[] c0 = A[0].toCharArray();

        List<Map<Character, Integer>> mapList = new ArrayList<>();
        for (int i = 1; i < A.length; i++) {
            char[] chars = A[i].toCharArray();
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : chars) {
                if (map.containsKey(c)) {
                    map.put(c, 1 + map.get(c));
                } else {
                    map.put(c, 1);
                }
            }
            mapList.add(map);
        }

        for (char c : c0) {
            boolean ok = true;
            for (Map<Character, Integer> map : mapList) {
                Integer value = map.get(c);
                if (value == null || value == 0) {
                    ok = false;
                    break;
                }
            }


            if (ok) {
                for (Map<Character, Integer> map : mapList) {
                    map.put(c, map.get(c) - 1);
                }
                list.add(String.valueOf(c));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        _1002_查找常用字符 v = new _1002_查找常用字符();
        System.out.println(v.commonChars(new String[]{"cool","lock","cook"}));
    }
}
