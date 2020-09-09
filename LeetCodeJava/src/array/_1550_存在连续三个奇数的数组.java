package array;

/**
 * url:https://leetcode-cn.com/problems/three-consecutive-odds/
 * Author:Savannah
 * Description:示例 1：
 * <p>
 * 输入：arr = [2,6,4,1]
 * 输出：false
 * 解释：不存在连续三个元素都是奇数的情况。
 * 示例 2：
 * <p>
 * 输入：arr = [1,2,34,3,4,5,7,23,12]
 * 输出：true
 * 解释：存在连续三个元素都是奇数的情况，即 [5,7,23] 。
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= arr.length <= 1000
 * 1 <= arr[i] <= 1000
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/three-consecutive-odds
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 8/31/20
 */
public class _1550_存在连续三个奇数的数组 {
    public static boolean threeConsecutiveOdds(int[] arr) {
        int n = 0;
        for (int i : arr) {
            if ((i & 1) == 0) {
                n = 0;
            } else {
                n++;
                if (n == 3) {
                    return true;
                }
            }

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(threeConsecutiveOdds(new int[]{2,6,4,1}));
    }
}
