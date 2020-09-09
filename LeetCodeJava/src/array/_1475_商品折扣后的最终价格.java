package array;

import java.util.Arrays;
import java.util.Stack;

/**
 * url:https://leetcode-cn.com/problems/final-prices-with-a-special-discount-in-a-shop/
 * Author:Savannah
 * Description:
 * 给你一个数组 prices ，其中 prices[i] 是商店里第 i 件商品的价格。
 * <p>
 * 商店里正在进行促销活动，如果你要买第 i 件商品，那么你可以得到与 prices[j] 相等的折扣，其中 j 是满足 j > i 且 prices[j] <= prices[i] 的 最小下标 ，如果没有满足条件的 j ，你将没有任何折扣。
 * <p>
 * 请你返回一个数组，数组中第 i 个元素是折扣后你购买商品 i 最终需要支付的价格。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：prices = [8,4,6,2,3]
 * 输出：[4,2,4,2,3]
 * 解释：
 * 商品 0 的价格为 price[0]=8 ，你将得到 prices[1]=4 的折扣，所以最终价格为 8 - 4 = 4 。
 * 商品 1 的价格为 price[1]=4 ，你将得到 prices[3]=2 的折扣，所以最终价格为 4 - 2 = 2 。
 * 商品 2 的价格为 price[2]=6 ，你将得到 prices[3]=2 的折扣，所以最终价格为 6 - 2 = 4 。
 * 商品 3 和 4 都没有折扣。
 * 示例 2：
 * <p>
 * 输入：prices = [1,2,3,4,5]
 * 输出：[1,2,3,4,5]
 * 解释：在这个例子中，所有商品都没有折扣。
 * 示例 3：
 * <p>
 * 输入：prices = [10,1,1,6]
 * 输出：[9,0,1,6]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/final-prices-with-a-special-discount-in-a-shop
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 6/17/20
 */
public class _1475_商品折扣后的最终价格 {

    public static int[] finalPrices(int[] prices) {
        int[] res = new int[prices.length];
        res[0] = 0;
        int j = 0;
        for (int i = 1; i < prices.length; i++) {
            while (j != -1 && prices[res[j]] >= prices[i]) {
                int a = res[j];
                prices[a] = prices[a] - prices[i];
                j--;
            }
            j++;
            res[j] = i;
        }
        return prices;


    }

    public static int[] finalPrices2(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i < prices.length; i++) {

            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                Integer j = stack.pop();
                prices[j] = prices[j] - prices[i]; //8入栈，8>4 8-4=4 8弹出,4入栈，6>4 入栈，[4,6] 6>2  6-2给第三个位置，6出栈，4-2 出栈,2入栈
            }
            stack.push(i);
        }
        return prices;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(finalPrices(new int[]{8, 4, 6, 2, 3})));
    }
}
