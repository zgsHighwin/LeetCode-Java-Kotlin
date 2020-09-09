package array;

import java.util.Arrays;

/**
 * url: https://leetcode-cn.com/problems/create-target-array-in-the-given-order/
 * Author:Savannah
 * Description:
 * 给你两个整数数组 nums 和 index。你需要按照以下规则创建目标数组：
 * <p>
 * 目标数组 target 最初为空。
 * 按从左到右的顺序依次读取 nums[i] 和 index[i]，在 target 数组中的下标 index[i] 处插入值 nums[i] 。
 * 重复上一步，直到在 nums 和 index 中都没有要读取的元素。
 * 请你返回目标数组。
 * <p>
 * 题目保证数字插入位置总是存在。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [0,1,2,3,4], index = [0,1,2,2,1]
 * 输出：[0,4,1,3,2]
 * 解释：
 * nums       index     target
 * 0            0        [0]
 * 1            1        [0,1]
 * 2            2        [0,1,2]
 * 3            2        [0,1,3,2]
 * 4            1        [0,4,1,3,2]
 * 示例 2：
 * <p>
 * 输入：nums = [1,2,3,4,0], index = [0,1,2,3,0]
 * 输出：[0,1,2,3,4]
 * 解释：
 * nums       index     target
 * 1            0        [1]
 * 2            1        [1,2]
 * 3            2        [1,2,3]
 * 4            3        [1,2,3,4]
 * 0            0        [0,1,2,3,4]
 * 示例 3：
 * <p>
 * 输入：nums = [1], index = [0]
 * 输出：[1]
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/create-target-array-in-the-given-order
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 6/11/20
 */
public class _1389_按既定顺序创建目标数组 {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int in = index[i];
            System.arraycopy(res, in, res, in+1, i-in);
            res[in] = nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(createTargetArray(new int[]{1,2,3,4,0}, new int[]{0,1,2,3,0})));
//        int[] b = {1, 2, 3, 4, 0};
//        System.arraycopy(b,1,b,2,3);
//        System.out.println(Arrays.toString(b));
    }
}
