package array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * url:https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 * Author:Savannah
 * Description:给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 示例 2：
 *
 * 输入：[-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/squares-of-a-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 10/16/20
 */
public class _977_有序数组的平方 {
    public static int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i]<0) {
                A[i] = -A[i];
            }else break;

        }
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i]*A[i];
        }
        return A;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortedSquares(new int[]{-7,-3,2,3,11})));

    }
}
