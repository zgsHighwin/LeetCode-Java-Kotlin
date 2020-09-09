package array;

/**
 * url:https://leetcode-cn.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
 * Author:Savannah
 * Description:
 * 输入：target = [1,2,3,4], arr = [2,4,1,3]
 * 输出：true
 * 解释：你可以按照如下步骤使 arr 变成 target：
 * 1- 翻转子数组 [2,4,1] ，arr 变成 [1,4,2,3]
 * 2- 翻转子数组 [4,2] ，arr 变成 [1,2,4,3]
 * 3- 翻转子数组 [4,3] ，arr 变成 [1,2,3,4]
 * 上述方法并不是唯一的，还存在多种将 arr 变成 target 的方法。
 * 示例 2：
 * <p>
 * 输入：target = [7], arr = [7]
 * 输出：true
 * 解释：arr 不需要做任何翻转已经与 target 相等。
 * 示例 3：
 * <p>
 * 输入：target = [1,12], arr = [12,1]
 * 输出：true
 * 示例 4：
 * <p>
 * 输入：target = [3,7,9], arr = [3,7,11]
 * 输出：false
 * 解释：arr 没有数字 9 ，所以无论如何也无法变成 target 。
 * 示例 5：
 * <p>
 * 输入：target = [1,1,1,1,1], arr = [1,1,1,1,1]
 * 输出：true
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/make-two-arrays-equal-by-reversing-sub-arrays
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 6/17/20
 */
public class _1460_通过翻转子数组使两个数组相等 {

    public static boolean canBeEqual(int[] target, int[] arr) {
        int[] r = new int[10001];
        for (int i : target) {
            r[i]++;
        }
        for (int i : arr) {
            if (r[i]<=0) {
                return false;
            }
            r[i]--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canBeEqual(new int[]{2,4,1}, new int[]{1,4,2}));
    }
}


