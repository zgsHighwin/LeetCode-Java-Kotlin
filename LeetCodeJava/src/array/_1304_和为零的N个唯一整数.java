package array;

import java.util.Arrays;

/**
 * url:https://leetcode-cn.com/problems/find-n-unique-integers-sum-up-to-zero/
 * Author:Savannah
 * Description:给你一个整数 n，请你返回 任意 一个由 n 个 各不相同 的整数组成的数组，并且这 n 个数相加和为 0 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 5
 * 输出：[-7,-1,1,3,4]
 * 解释：这些数组也是正确的 [-5,-1,1,2,3]，[-3,-1,2,-2,4]。
 * 示例 2：
 * <p>
 * 输入：n = 3
 * 输出：[-1,0,1]
 * 示例 3：
 * <p>
 * 输入：n = 1
 * 输出：[0]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-n-unique-integers-sum-up-to-zero
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 6/19/20
 */
public class _1304_和为零的N个唯一整数 {
    public static int[] sumZero(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n >> 1; i++) {
            res[i] = i - n;
            res[n - i - 1] = n - i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(1)));
    }
}
