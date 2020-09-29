package bitmanipulation;

import java.util.*;

/**
 * url:https://leetcode-cn.com/problems/sort-integers-by-the-number-of-1-bits/
 * Author:Savannah
 * Description:
 * 输入：arr = [0,1,2,3,4,5,6,7,8]
 * 输出：[0,1,2,4,8,3,5,6,7]
 * 解释：[0] 是唯一一个有 0 个 1 的数。
 * [1,2,4,8] 都有 1 个 1 。
 * [3,5,6] 有 2 个 1 。
 * [7] 有 3 个 1 。
 * 按照 1 的个数排序得到的结果数组为 [0,1,2,4,8,3,5,6,7]
 * 示例 2：
 * <p>
 * 输入：arr = [1024,512,256,128,64,32,16,8,4,2,1]
 * 输出：[1,2,4,8,16,32,64,128,256,512,1024]
 * 解释：数组中所有整数二进制下都只有 1 个 1 ，所以你需要按照数值大小将它们排序。
 * 示例 3：
 * <p>
 * 输入：arr = [10000,10000]
 * 输出：[10000,10000]
 * 示例 4：
 * <p>
 * 输入：arr = [2,3,5,7,11,13,17,19]
 * 输出：[2,3,5,17,7,11,13,19]
 * 示例 5：
 * <p>
 * 输入：arr = [10,100,1000,10000]
 * 输出：[10,100,10000,1000]
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sort-integers-by-the-number-of-1-bits
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/25/20
 */
public class _1356_根据数字二进制下_1_的数目排序 {
    public static int[] sortByBits(int[] arr) {
        Map<Integer, List<Integer>> treeMap = new TreeMap<>();
        int j = 0;
        for (int i : arr) {
            int k = i;
            if (i == 0) {
                List<Integer> list = new ArrayList<>();
                list.add(0);
                treeMap.put(0, list);
            } else {
                j = 0;
                while (k != 0) {
                    if ((k & 1) == 1) {
                        j++;
                    }
                    k = (k >> 1);
                }
                List<Integer> list = treeMap.get(j);
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(i);
                treeMap.put(j, list);
            }
        }
        List<Integer> l = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : treeMap.entrySet()) {
            List<Integer> value = entry.getValue();
            Collections.sort(value);
            l.addAll(value);
        }
        int[] data = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            data[i] = l.get(i);
        }
        return data;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortByBits(new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1})));
    }
}
