package array;

import java.util.Arrays;

/**
 * url:https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side/
 * Author:Savannah
 * Description:
 * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 * <p>
 * 完成所有替换操作后，请你返回这个数组。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：arr = [17,18,5,4,6,1]
 * 输出：[18,6,6,6,1,-1]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= arr.length <= 10^4
 * 1 <= arr[i] <= 10^5
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 6/18/20
 */
public class _1299_将每个元素替换为右侧最大元素 {
    public static int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            arr[0] = -1;
            return arr;
        }

        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int t = arr[i];
            arr[i] = max;
            max = t > arr[i] ? t : arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[]{17, 18, 5, 4, 6, 1})));
    }
}
