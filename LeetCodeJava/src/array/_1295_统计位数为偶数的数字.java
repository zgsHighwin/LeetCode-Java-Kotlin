package array;

/**
 * url:https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits/
 * Author:Savannah
 * Description:
 * 示例 1：
 * <p>
 * 输入：nums = [12,345,2,6,7896]
 * 输出：2
 * 解释：
 * 12 是 2 位数字（位数为偶数） 
 * 345 是 3 位数字（位数为奇数）  
 * 2 是 1 位数字（位数为奇数） 
 * 6 是 1 位数字 位数为奇数） 
 * 7896 是 4 位数字（位数为偶数）  
 * 因此只有 12 和 7896 是位数为偶数的数字
 * 示例 2：
 * <p>
 * 输入：nums = [555,901,482,1771]
 * 输出：1
 * 解释：
 * 只有 1771 是位数为偶数的数字。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 6/11/20
 */
public class _1295_统计位数为偶数的数字 {
    public static int findNumbers(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int res = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num < 10) {
                continue;
            } else if (num < 100) {
                res++;
            } else if (num < 1000) {
                continue;
            } else if (num < 10000) {
                res++;
            } else {
                j = 0;
                while (num != 0) {
                    num = num / 10;
                    j++;
                }
                if (j % 2 == 0) {
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(findNumbers(new int[]{555,901,482,1771,100,1,22,333,4444,55555,666666}));
    }
}
