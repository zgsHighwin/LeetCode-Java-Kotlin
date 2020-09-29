package bitmanipulation;

/**
 * url:
 * Author:Savannah
 * Description:
 * 给定一个正整数 N，找到并返回 N 的二进制表示中两个相邻 1 之间的最长距离。 
 * <p>
 * 如果没有两个相邻的 1，返回 0 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：22
 * 输出：2
 * 解释：
 * 22 的二进制是 0b10110 。
 * 在 22 的二进制表示中，有三个 1，组成两对相邻的 1 。
 * 第一对相邻的 1 中，两个 1 之间的距离为 2 。
 * 第二对相邻的 1 中，两个 1 之间的距离为 1 。
 * 答案取两个距离之中最大的，也就是 2 。
 * 示例 2：
 * <p>
 * 输入：5
 * 输出：2
 * 解释：
 * 5 的二进制是 0b101 。
 * 示例 3：
 * <p>
 * 输入：6
 * 输出：1
 * 解释：
 * 6 的二进制是 0b110 。
 * 示例 4：
 * <p>
 * 输入：8
 * 输出：0
 * 解释：
 * 8 的二进制是 0b1000 。
 * 在 8 的二进制表示中没有相邻的两个 1，所以返回 0 。
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= N <= 10^9
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-gap
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/29/20
 */
public class _868_二进制间距 {

    public static int binaryGap(int N) {

        int maxValue = 0;
        int temp = -1;
        while (N != 0) {

            if ((N & 1) == 1) {
                temp++;
                if (temp > 0) {
                    maxValue = Math.max(maxValue, temp);
                    temp = 0;
                }
            }else {
                if(temp!=-1){
                    temp++;
                }
            }
            N = N >> 1;
        }
        return maxValue;
    }

    public static void main(String[] args) {
//        Arguments of 'max' are the same. Calling this method with the same arguments is meaningless.
//        System.out.println(binaryGap(6));
        System.out.println(binaryGap(8));

        int a = 9;
        int b = 2;

        System.out.println((a + b + Math.abs(a - b)) / 2);
    }
}
