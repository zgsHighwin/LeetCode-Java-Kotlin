package number;

import java.util.ArrayList;
import java.util.List;

/**
 * url:https://leetcode-cn.com/problems/self-dividing-numbers/
 * Author:Savannah
 * Description:
 * 自除数 是指可以被它包含的每一位数除尽的数。
 * <p>
 * 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 * <p>
 * 还有，自除数不允许包含 0 。
 * <p>
 * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * 上边界left = 1, 下边界right = 22
 * 输出： [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * 注意：
 * <p>
 * 每个输入参数的边界满足 1 <= left <= right <= 10000。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/self-dividing-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 7/29/20
 */
public class _728_自除数 {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (i < 10) {
                list.add(i);
                continue;
            }
            if (i % 10 == 0) {
                continue;
            }
            int j = i;
            boolean isOk = true;
            while (j != 0) {
                int mod = j % 10;
                if (mod == 0 || i % mod != 0) {
                    isOk = false;
                    break;
                }
                j = j / 10;
            }
            if (isOk) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        System.out.println(selfDividingNumbers(1, 22));
    }
}
