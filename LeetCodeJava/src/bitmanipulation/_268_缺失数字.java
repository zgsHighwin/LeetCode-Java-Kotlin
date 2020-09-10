package bitmanipulation;

/**
 * url:https://leetcode-cn.com/problems/missing-number/
 * Author:Savannah
 * Description:
 * 给定一个包含 0, 1, 2, ..., n 中 n 个数的序列，找出 0 .. n 中没有出现在序列中的那个数。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: [3,0,1]
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: [9,6,4,2,3,5,7,0,1]
 * 输出: 8
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/missing-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/10/20
 */
public class _268_缺失数字 {
    public static int missingNumber(int[] nums) {
        int len = nums.length;
        int f = 0;
        for (int i = 0; i < len; i++) {
            f ^= nums[i] ^ i;
        }
        return f ^ len;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }
}
