package array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * url:
 * Author:Savannah
 * Description:
 * 给你两个数组，arr1 和 arr2，
 * <p>
 * arr2 中的元素各不相同
 * arr2 中的每个元素都出现在 arr1 中
 * 对 arr1 中的元素进行排序，使 arr1 中项的相对顺序和 arr2 中的相对顺序相同。未在 arr2 中出现过的元素需要按照升序放在 arr1 的末尾。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 * 输出：[2,2,2,1,4,3,3,9,6,7,19]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= arr1.length, arr2.length <= 1000
 * 0 <= arr1[i], arr2[i] <= 1000
 * arr2 中的元素 arr2[i] 各不相同
 * arr2 中的每个元素 arr2[i] 都出现在 arr1 中
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/relative-sort-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 2021/4/6
 */
public class _1122_数组的相对排序 {
    public static void main(String[] args) {
        _1122_数组的相对排序 v = new _1122_数组的相对排序();
        System.out.println(Arrays.toString(v.relativeSortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6})));
    }
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        int[] arr = new int[arr1.length];
        int arrIndex = 0;
        for (int i = 0; i < arr2.length; i++) {
            int ele = arr2[i];
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == ele) {
                    arr[arrIndex] = ele;
                    arrIndex++;
                    arr1[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != -1) {
                arr[arrIndex] = arr1[i];
                arrIndex++;
            }
        }
        return arr;
    }
}
