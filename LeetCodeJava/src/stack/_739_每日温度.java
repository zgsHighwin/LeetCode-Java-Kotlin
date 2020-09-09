package stack;

import java.util.Arrays;

/**
 * url:https://leetcode-cn.com/problems/daily-temperatures/
 * Author:Savannah
 * Description:
 * 根据每日 气温 列表，请重新生成一个列表，对应位置的输出是需要再等待多久温度才会升高超过该日的天数。如果之后都不会升高，请在该位置用 0 来代替。
 * <p>
 * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
 * <p>
 * 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的均为华氏度，都是在 [30, 100] 范围内的整数。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/daily-temperatures
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 6/11/20
 */
public class _739_每日温度 {

    public static int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            res[i] = T[i];
            int j = i + 1;
            int v=0;
            while (j < T.length) {
                if (T[j] > res[i]) {
                    res[i] = j - i;
                    v=1;
                    break;
                }
                j++;
            }
            if(v==0){
                res[i]=0;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73,75})));
    }
}
