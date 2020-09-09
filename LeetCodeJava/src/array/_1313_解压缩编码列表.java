package array;

import java.util.Arrays;

/**
 * url:https://leetcode-cn.com/problems/decompress-run-length-encoded-list/
 * Author:Savannah
 * Description:
 * 给你一个以行程长度编码压缩的整数列表 nums 。
 * <p>
 * 考虑每对相邻的两个元素 [freq, val] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ），每一对都表示解压后子列表中有 freq 个值为 val 的元素，你需要从左到右连接所有子列表以生成解压后的列表。
 * <p>
 * 请你返回解压后的列表。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：nums = [1,2,3,4]
 * 输出：[2,4,4,4]
 * 解释：第一对 [1,2] 代表着 2 的出现频次为 1，所以生成数组 [2]。
 * 第二对 [3,4] 代表着 4 的出现频次为 3，所以生成数组 [4,4,4]。
 * 最后将它们串联到一起 [2] + [4,4,4] = [2,4,4,4]。
 * 示例 2：
 * <p>
 * 输入：nums = [1,1,2,3]
 * 输出：[1,3,3]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/decompress-run-length-encoded-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 6/11/20
 */
public class _1313_解压缩编码列表 {

    public static int[] decompressRLElist(int[] nums) {
        int l = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            l += nums[i];
        }
        int[] res = new int[l];
        int j;
        int v = 0;

        for (int i = 1; i < nums.length; i = i + 2) {
            j = 0;
            while (j < nums[i - 1]) {
                res[v] = nums[i];
                j++;
                v++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(decompressRLElist(new int[]{1,1,2,3})));
    }
}
