package array;

import java.util.ArrayList;
import java.util.List;

/**
 * url:https://leetcode-cn.com/problems/sort-array-by-parity/
 * Author:Savannah
 * Description:
 * <p>
 * 给定一个非负整数数组 A，返回一个数组，在该数组中， A 的所有偶数元素之后跟着所有奇数元素。
 * <p>
 * 你可以返回满足此条件的任何数组作为答案。
 * <p>
 * <p>
 * <p>
 * 示例：
 * <p>
 * 输入：[3,1,2,4]
 * 输出：[2,4,3,1]
 * 输出 [4,2,3,1]，[2,4,1,3] 和 [4,2,1,3] 也会被接受。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= A.length <= 5000
 * 0 <= A[i] <= 5000
 * LeetCodeTesting 9/27/20
 */
public class _905_按奇偶排序数组 {

    public int[] sortArrayByParity(int[] A) {
        List<Integer> l = new ArrayList<>();
        for (int i : A) {
            if ((i & 1) == 0) {
                l.add(0, i);
            } else {
                l.add(i);
            }
        }
        for (int i = 0; i < l.size(); i++) {
            A[i] = l.get(i);
        }
        return A;
    }
}
