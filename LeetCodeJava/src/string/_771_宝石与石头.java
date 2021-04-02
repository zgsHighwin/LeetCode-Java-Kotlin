package string;

/**
 * url:https://leetcode-cn.com/problems/jewels-and-stones/
 * Author:Savannah
 * Description:
 *  给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * <p>
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: J = "aA", S = "aAAbbbb"
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: J = "z", S = "ZZ"
 * 输出: 0
 * 注意:
 * <p>
 * S 和 J 最多含有50个字母。
 *  J 中的字符不重复。
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/jewels-and-stones
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 2021/3/26
 */
public class _771_宝石与石头 {
    public  static int numJewelsInStones(String J, String S) {
        if (J == null || J.length() == 0) {
            return 0;
        }
        if (S == null || S.length() == 0) {
            return 0;
        }

        char[] jArray = J.toCharArray();

        char[] sArray = S.toCharArray();

        int r = 0;
        for (int i = 0; i < jArray.length; i++) {
            char c = jArray[i];
            for (int j = 0; j < sArray.length; j++) {
                if (c ==  sArray[j]) {
                    r++;
                }
            }
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("z","ZZ"));
    }
}
