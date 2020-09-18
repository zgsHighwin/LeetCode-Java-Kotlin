package search;

/**
 * url:https://leetcode-cn.com/problems/binary-search/
 * Author:Savannah
 * Description:
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 * 示例 2:
 * <p>
 * 输入: nums = [-1,0,3,5,9,12], target = 2
 * 输出: -1
 * 解释: 2 不存在 nums 中因此返回 -1
 *  
 * <p>
 * 提示：
 * <p>
 * 你可以假设 nums 中的所有元素是不重复的。
 * n 将在 [1, 10000]之间。
 * nums 的每个元素都将在 [-9999, 9999]之间。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-search
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/17/20
 */
public class _704_二分查找 {
    public static int search(int[] nums, int target) {

        int length = nums.length;
        int starIndex = 0;
        int endIndex = length;
        while (endIndex-starIndex>1) {
            int midIndex = (starIndex + endIndex) >> 1;
            if (target < nums[midIndex]) {
                endIndex = midIndex;
            } else if (target > nums[midIndex]) {
                starIndex = midIndex;
            } else {
                return midIndex;
            }
        }
        if(nums[starIndex]==target){
            return starIndex;
        }
        if(nums[endIndex] == target){
            return endIndex;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{5}, 5));
    }
}
