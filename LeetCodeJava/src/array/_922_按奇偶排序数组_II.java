package array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * url:
 * Author:Savannah
 * Description:
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 * <p>
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 * <p>
 * 你可以返回任何满足上述条件的数组作为答案。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：[4,2,5,7]
 * 输出：[4,5,2,7]
 * 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 *  
 * <p>
 * 提示：
 * <p>
 * 2 <= A.length <= 20000
 * A.length % 2 == 0
 * 0 <= A[i] <= 1000
 *  
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-array-by-parity-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 2021/4/2
 */
public class _922_按奇偶排序数组_II {
    public static void main(String[] args) {
        _922_按奇偶排序数组_II ii = new _922_按奇偶排序数组_II();
        System.out.println(Arrays.toString(ii.sortArrayByParityII(new int[]{4, 2, 5, 7})));
    }
    public int[] sortArrayByParityII(int[] nums) {
        int[] arr = new int[nums.length];
        int oddIndex = 1;//第一个奇数
        int evenIndex = 0;//第一个偶数
        for (int num : nums) {
            if ((num & 1) == 0) {
                arr[evenIndex] = num;
                evenIndex += 2;
            } else {
                arr[oddIndex] = num;
                oddIndex += 2;
            }
        }
        return arr;
    }
}
