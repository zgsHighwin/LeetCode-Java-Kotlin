package number;

/**
 * url:https://leetcode-cn.com/problems/swap-numbers-lcci/
 * Author:Savannah
 * Description:
 * 编写一个函数，不用临时变量，直接交换numbers = [a, b]中a与b的值。
 * <p>
 * 示例：
 * <p>
 * 输入: numbers = [1,2]
 * 输出: [2,1]
 * 提示：
 * <p>
 * numbers.length == 2
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/swap-numbers-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/9/20
 */
public class 面试题_16_01_交换数字 {
    public int[] swapNumbers2(int[] numbers) {
        int c = numbers[0] + numbers[1]; //有可能有溢出风险
        numbers[1] = c - numbers[1];
        numbers[0] = c - numbers[1];
        return numbers;
    }

    public int[] swapNumbers(int[] numbers) {
        /**
         * a ^ b ^ b = a
         * a ^ b ^ a = b
         *
         * a ^ a = 0
         * 0 ^ a = a
         * 异或满足交换律 结合律
         * a^b  = c;
         * a^c = b;
         * b^c = a
         */
        numbers[0] = numbers[0] ^ numbers[1];
        numbers[1] = numbers[0] ^ numbers[1];//numbers[0] ^ numbers[1] ^numbers[1];
        numbers[0] = numbers[0] ^ numbers[1];//numbers[0] ^ numbers[1] ^numbers[0] ^ numbers[1] ^numbers[1]
        return numbers;
    }
}
