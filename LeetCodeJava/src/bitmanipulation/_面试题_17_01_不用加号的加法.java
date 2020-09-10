package bitmanipulation;

/**
 * url:https://leetcode-cn.com/problems/add-without-plus-lcci/
 * Author:Savannah
 * Description:
 * 设计一个函数把两个数字相加。不得使用 + 或者其他算术运算符。
 * <p>
 * 示例:
 * <p>
 * 输入: a = 1, b = 1
 * 输出: 2
 *  
 * <p>
 * 提示：
 * <p>
 * a, b 均可能是负数或 0
 * 结果不会溢出 32 位整数
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-without-plus-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/10/20
 */
public class _面试题_17_01_不用加号的加法 {
    public static int add(int a, int b) {
        if (b == 0) {
            return a;
        }
        int sum = a ^ b;

        int c = (a & b) << 1;
        return add(sum, c);
    }

    public static void main(String[] args) {
        System.out.println(add(1, 3));

    }

}
