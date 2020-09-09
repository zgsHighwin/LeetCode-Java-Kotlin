package string;

/**
 * url:https://leetcode-cn.com/problems/longest-common-prefix/
 * Author:Savannah
 * Description:
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 6/15/20
 */
public class _14_最长公共前缀 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        int l = strs.length;
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (int i = 1; ; i++) {
            String str = strs[0];
            String strI = strs[i];
            if (j == str.length() || j == strI.length()) {
                break;
            }
            char c = str.charAt(j);
            char cI = strI.charAt(j);
            if (c == cI) {
                if (i == l - 1) {
                    j++;
                    i = 0;
                    sb.append(c);
                }
            } else {
                break;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
//        System.out.println(longestCommonPrefix(new String[]{"aaa"}));

    }
}
