package bitmanipulation;

/**
 * url:https://leetcode-cn.com/problems/hamming-distance/
 * Author:Savannah
 * Description:
 * 两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 * <p>
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 * <p>
 * 注意：
 * 0 ≤ x, y < 231.
 * <p>
 * 示例:
 * <p>
 * 输入: x = 1, y = 4
 * <p>
 * 输出: 2
 * <p>
 * 解释:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ↑   ↑
 * <p>
 * 上面的箭头指出了对应二进制位不同的位置。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/hamming-distance
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 7/3/20
 */
public class _461_汉明距离 {
    public static int hammingDistance(int x, int y) {
        int count = 0;
        while (x != 0 || y != 0) {
            int xMod = x & 1;
            int yMod = y & 1;
            x = x >> 1;
            y = y >> 1;
            if ((xMod ^ yMod) == 1) {
                count++;
            }
        }
        return count;
    }

    public static int hammingDistance2(int x, int y) {
        int count = 0;
        int c = x ^ y;
        while (c != 0) {
            count+= c&1;
            c=c>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }
}
