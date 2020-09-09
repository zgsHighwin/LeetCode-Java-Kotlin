package string;

import java.util.Arrays;

/**
 * url:https://leetcode-cn.com/problems/di-string-match/
 * Author:Savannah
 * Description:
 * 给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。
 * <p>
 * 返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：
 * <p>
 * 如果 S[i] == "I"，那么 A[i] < A[i+1]
 * 如果 S[i] == "D"，那么 A[i] > A[i+1]
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入："IDID"
 * 输出：[0,4,1,3,2]
 * 示例 2：
 * <p>
 * 输入："III"
 * 输出：[0,1,2,3]
 * 示例 3：
 * <p>
 * 输入："DDI"
 * 输出：[3,2,0,1]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= S.length <= 10000
 * S 只包含字符 "I" 或 "D"。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/di-string-match
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/2/20
 */
public class _942_增减字符串匹配 {
    public static int[] diStringMatch(String S) {
        int[] data = new int[S.length() + 1];
        char[] chars = S.toCharArray();
        int left = 0;
        int right = S.length();
        for (int i = 0, j = 0; i < chars.length; i++, j = i) {
            char c = chars[i];
            data[i] = c == 'I' ? left++ : right--;
        }
        data[S.length()] = left;

        return data;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(diStringMatch("IDID")));
    }
}
