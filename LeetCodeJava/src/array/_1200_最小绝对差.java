package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * url:https://leetcode-cn.com/problems/minimum-absolute-difference/
 * Author:Savannah
 * Description:给你个整数数组 arr，其中每个元素都 不相同。
 * <p>
 * 请你找到所有具有最小绝对差的元素对，并且按升序的顺序返回。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：arr = [4,2,1,3]
 * 输出：[[1,2],[2,3],[3,4]]
 * 示例 2：
 * <p>
 * 输入：arr = [1,3,6,10,15]
 * 输出：[[1,3]]
 * 示例 3：
 * <p>
 * 输入：arr = [3,8,-10,23,19,-4,-14,27]
 * 输出：[[-14,-10],[19,23],[23,27]]
 *  
 * <p>
 * 提示：
 * <p>
 * 2 <= arr.length <= 10^5
 * -10^6 <= arr[i] <= 10^6
 * 通过次数11,287提交次数16,854
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-absolute-difference
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/25/20
 */
public class _1200_最小绝对差 {

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> firstList = new ArrayList<>();
        int minAbsolute = arr[1] - arr[0];
        firstList.add(arr[0]);
        firstList.add(arr[1]);
        list.add(firstList);

        for (int i = 2; i < arr.length; i++) {
            int minValue = arr[i] - arr[i - 1];
            if (minValue == minAbsolute) {
                List<Integer> l = new ArrayList<>();
                l.add(arr[i - 1]);
                l.add(arr[i]);
                list.add(l);
            } else if (minValue < minAbsolute) {
                minAbsolute = minValue;
                list.clear();
                List<Integer> l = new ArrayList<>();
                l.add(arr[i - 1]);
                l.add(arr[i]);
                list.add(l);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(minimumAbsDifference(new int[]{40,11,26,27,-20}));
    }
}
