package array;

/**
 * url:
 * Author:Savannah
 * Description:
 * 给你一个数组 nums 。nums 的源数组中，所有元素与 nums 相同，但按非递减顺序排列。
 * <p>
 * 如果 nums 能够由源数组轮转若干位置（包括 0 个位置）得到，则返回 true ；否则，返回 false 。
 * <p>
 * 源数组中可能存在 重复项 。
 * <p>
 * 注意：我们称数组 A 在轮转 x 个位置后得到长度相同的数组 B ，当它们满足 A[i] == B[(i+x) % A.length] ，其中 % 为取余运算。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [3,4,5,1,2]
 * 输出：true
 * 解释：[1,2,3,4,5] 为有序的源数组。
 * 可以轮转 x = 3 个位置，使新数组从值为 3 的元素开始：[3,4,5,1,2] 。
 * 示例 2：
 * <p>
 * 输入：nums = [2,1,3,4]
 * 输出：false
 * 解释：源数组无法经轮转得到 nums 。
 * 示例 3：
 * <p>
 * 输入：nums = [1,2,3]
 * 输出：true
 * 解释：[1,2,3] 为有序的源数组。
 * 可以轮转 x = 0 个位置（即不轮转）得到 nums 。
 * 示例 4：
 * <p>
 * 输入：nums = [1,1,1]
 * 输出：true
 * 解释：[1,1,1] 为有序的源数组。
 * 轮转任意个位置都可以得到 nums 。
 * 示例 5：
 * <p>
 * 输入：nums = [2,1]
 * 输出：true
 * 解释：[1,2] 为有序的源数组。
 * 可以轮转 x = 5 个位置，使新数组从值为 2 的元素开始：[2,1] 。
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/check-if-array-is-sorted-and-rotated
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 2021/4/2
 */
public class _1752_检查数组是否经排序和轮转得到 {

    public boolean check(int[] nums) {
        if (nums.length == 0) {
            return true;
        }
        int first = nums[0];
        int last = nums[nums.length - 1];
        int max = first;
        if (first < last) {
            for (int i = 1; i < nums.length; i++) {
                int num = nums[i];
                if (num >= max) {
                    max = num;
                } else return false;
            }
        } else {
            int min = Integer.MIN_VALUE;
            for (int i = 1; i < nums.length; i++) {
                int num = nums[i];
                if (max <= num) {
                    max = num;
                } else {
                    if (num > min) {
                        min = num;
                    } else {
                        return false;
                    }
                    if (first < num) {

                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        _1752_检查数组是否经排序和轮转得到 v = new _1752_检查数组是否经排序和轮转得到();
        System.out.println(v.check(new int[]{1, 2, 3, 4}));
        System.out.println(v.check(new int[]{1, 1, 1, 2}));
        System.out.println(v.check(new int[]{3, 4, 5, 1, 2}));
        System.out.println(v.check(new int[]{1334451}));
        System.out.println(v.check(new int[]{3445113}));
        System.out.println(v.check(new int[]{2, 1, 4, 3}));
        System.out.println(v.check(new int[]{6, 10, 6}));
        System.out.println(v.check(new int[]{8, 5, 4, 5, 1, 4, 5, 2, 2}));
    }
}
//2143
//34512
//1133445
//1334451
