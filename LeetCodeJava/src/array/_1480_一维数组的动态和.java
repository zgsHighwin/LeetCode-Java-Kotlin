package array;

import java.util.Arrays;

/**
 * url:https://leetcode-cn.com/problems/running-sum-of-1d-array/
 * Author:Savannah
 * Description:
 * 给你一个数组 nums 。数组「动态和」的计算公式为：runningSum[i] = sum(nums[0]…nums[i]) 。
 * <p>
 * 请返回 nums 的动态和。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,2,3,4]
 * 输出：[1,3,6,10]
 * 解释：动态和计算过程为 [1, 1+2, 1+2+3, 1+2+3+4] 。
 * 示例 2：
 * <p>
 * 输入：nums = [1,1,1,1,1]
 * 输出：[1,2,3,4,5]
 * 解释：动态和计算过程为 [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1] 。
 * 示例 3：
 * <p>
 * 输入：nums = [3,1,2,10,1]
 * 输出：[3,4,6,16,17]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/running-sum-of-1d-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 6/15/20
 */
public class _1480_一维数组的动态和 {
    public static int[] runningSum(int[] nums) {
        if (nums == null || nums.length == 0 || nums.length == 1) {
            return nums;
        }

        for (int i = 1; i < nums.length; i++) {
            nums[i] = (nums[i] += nums[i - 1]);
        }
        return nums;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{1,1,1,1,1})));
    }
}
