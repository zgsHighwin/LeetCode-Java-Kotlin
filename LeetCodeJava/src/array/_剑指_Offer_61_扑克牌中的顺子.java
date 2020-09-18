package array;

import java.util.Arrays;

/**
 * url:https://leetcode-cn.com/problems/bu-ke-pai-zhong-de-shun-zi-lcof/
 * Author:Savannah
 * Description:从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3,4,5]
 * 输出: True
 *  
 * <p>
 * 示例 2:
 * <p>
 * 输入: [0,0,1,2,5]
 * 输出: True
 *  
 * <p>
 * 限制：
 * <p>
 * 数组长度为 5 
 * <p>
 * 数组的数取值为 [0, 13] .
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/bu-ke-pai-zhong-de-shun-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/16/20
 */
public class _剑指_Offer_61_扑克牌中的顺子 {
    public static boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int zeroCount = 0;
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            }
        }
        if (!(nums[nums.length - 1] - nums[zeroCount] <= 4)) {
            return false;
        }

        int first = nums[zeroCount];
        for (int i = ++zeroCount; i < nums.length; i++) {
            if (nums[i] <= first) {
                return false;
            } else {
                first = nums[i];
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isStraight(new int[]{0, 0, 1, 2, 6}));
    }
}
