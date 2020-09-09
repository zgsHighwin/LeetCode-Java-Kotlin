package array;

import java.util.Arrays;

/**
 * url:https://leetcode-cn.com/problems/maximum-product-of-two-elements-in-an-array/
 * Author:Savannah
 * Description:
 * 给你一个整数数组 nums，请你选择数组的两个不同下标 i 和 j，使 (nums[i]-1)*(nums[j]-1) 取得最大值。
 * <p>
 * 请你计算并返回该式的最大值。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [3,4,5,2]
 * 输出：12
 * 解释：如果选择下标 i=1 和 j=2（下标从 0 开始），则可以获得最大值，(nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12 。
 * 示例 2：
 * <p>
 * 输入：nums = [1,5,4,5]
 * 输出：16
 * 解释：选择下标 i=1 和 j=3（下标从 0 开始），则可以获得最大值 (5-1)*(5-1) = 16 。
 * 示例 3：
 * <p>
 * 输入：nums = [3,7]
 * 输出：12
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-product-of-two-elements-in-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 6/16/20
 */
public class _1464_数组中两元素的最大乘积 {
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }

    public static int maxProduct2(int[] nums) {
        int max = 0;
        int sm = 0;
        for (int num : nums) {
            if (num > max) {
                sm = max;
                max = num;
            } else if (num > sm) {
                sm = num;
            }
        }
        return (max - 1) * (sm - 1);
    }


    public static void main(String[] args) {

    }
}
