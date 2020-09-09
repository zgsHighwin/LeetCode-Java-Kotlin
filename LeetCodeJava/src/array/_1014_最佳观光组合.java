package array;

/**
 * url:
 * Author:Savannah
 * Description:https://leetcode-cn.com/problems/best-sightseeing-pair/
 * 给定正整数数组 A，A[i] 表示第 i 个观光景点的评分，并且两个景点 i 和 j 之间的距离为 j - i。
 * <p>
 * 一对景点（i < j）组成的观光组合的得分为（A[i] + A[j] + i - j）：景点的评分之和减去它们两者之间的距离。
 * <p>
 * 返回一对观光景点能取得的最高分。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：[8,1,5,2,6]
 * 输出：11
 * 解释：i = 0, j = 2, A[i] + A[j] + i - j = 8 + 5 + 0 - 2 = 11
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/best-sightseeing-pair
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 6/17/20
 */
public class _1014_最佳观光组合 {
    public static int maxScoreSightseeingPair(int[] A) {
        int cur = 0, max = A[0];
        for (int j = 1; j < A.length; j++) {
            cur = Math.max(cur, max + A[j] - j);
            max = Math.max(max, A[j] + j);//这个A[j]+相当于是A[i]+i

        }
        return cur;
    }

    public static void main(String[] args) {
        System.out.println(maxScoreSightseeingPair(new int[]{8, 1, 5, 2, 6}));
    }
}
