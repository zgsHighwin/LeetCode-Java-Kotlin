package array;

/**
 * url:
 * Author:Savannah
 * Description:
 * 符合下列属性的数组 arr 称为 山脉数组 ：
 * arr.length >= 3
 * 存在 i（0 < i < arr.length - 1）使得：
 * arr[0] < arr[1] < ... arr[i-1] < arr[i]
 * arr[i] > arr[i+1] > ... > arr[arr.length - 1]
 * 给你由整数组成的山脉数组 arr ，返回任何满足 arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1] 的下标 i 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：arr = [0,1,0]
 * 输出：1
 * 示例 2：
 * <p>
 * 输入：arr = [0,2,1,0]
 * 输出：1
 * 示例 3：
 * <p>
 * 输入：arr = [0,10,5,2]
 * 输出：1
 * 示例 4：
 * <p>
 * 输入：arr = [3,4,5,1]
 * 输出：2
 * 示例 5：
 * <p>
 * 输入：arr = [24,69,100,99,79,78,67,36,26,19]
 * 输出：2
 *  
 * <p>
 * 提示：
 * <p>
 * 3 <= arr.length <= 104
 * 0 <= arr[i] <= 106
 * 题目数据保证 arr 是一个山脉数组
 *  
 * <p>
 * 进阶：很容易想到时间复杂度 O(n) 的解决方案，你可以设计一个 O(log(n)) 的解决方案吗？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/peak-index-in-a-mountain-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 2021/4/9
 */
public class _852_山脉数组的峰顶索引 {
    public static void main(String[] args) {
        _852_山脉数组的峰顶索引 v = new _852_山脉数组的峰顶索引();
        System.out.println(v.peakIndexInMountainArray(new int[]{0, 1, 0}));
        System.out.println(v.peakIndexInMountainArray(new int[]{0,10,5,2}));
        System.out.println(v.peakIndexInMountainArray(new int[]{3,4,5,1}));
        System.out.println(v.peakIndexInMountainArray(new int[]{24,69,100,99,79,78,67,36,26,19}));
    }
    public int peakIndexInMountainArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return i - 1;
            }
            if (arr[arr.length - i - 2] < arr[arr.length - i - 1]) {
                return arr.length - i - 1;
            }
        }
        return 0;
    }
}
