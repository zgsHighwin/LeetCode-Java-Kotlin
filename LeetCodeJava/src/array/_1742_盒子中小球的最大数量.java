package array;

/**
 * url:
 * Author:Savannah
 * Description:
 * 输入：lowLimit = 1, highLimit = 10
 * 输出：2
 * 解释：
 * 盒子编号：1 2 3 4 5 6 7 8 9 10 11 ...
 * 小球数量：2 1 1 1 1 1 1 1 1 0  0  ...
 * 编号 1 的盒子放有最多小球，小球数量为 2 。
 * 示例 2：
 * <p>
 * 输入：lowLimit = 5, highLimit = 15
 * 输出：2
 * 解释：
 * 盒子编号：1 2 3 4 5 6 7 8 9 10 11 ...
 * 小球数量：1 1 1 1 2 2 1 1 1 0  0  ...
 * 编号 5 和 6 的盒子放有最多小球，每个盒子中的小球数量都是 2 。
 * 示例 3：
 * <p>
 * 输入：lowLimit = 19, highLimit = 28
 * 输出：2
 * 解释：
 * 盒子编号：1 2 3 4 5 6 7 8 9 10 11 12 ...
 * 小球数量：0 1 1 1 1 1 1 1 1 2  0  0  ...
 * 编号 10 的盒子放有最多小球，小球数量为 2 。
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= lowLimit <= highLimit <= 105
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-number-of-balls-in-a-box
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 2021/4/2
 */
public class _1742_盒子中小球的最大数量 {
    public static void main(String[] args) {
        _1742_盒子中小球的最大数量 v = new _1742_盒子中小球的最大数量();
        System.out.println(v.countBalls(19, 28));
    }
    public int countBalls(int lowLimit, int highLimit) {
        int arr[] = new int[100];
        for (int i = lowLimit; i < highLimit + 1; i++) {
            int v = sumNumber(i);
            arr[v] = ++arr[v];
        }
        int max = 0;
        for (int j : arr) {
            if(j>max){
                max = j;
            }
        }
        return max;
    }

    public int sumNumber(int num) {
        int r = 0;
        while (num != 0) {
            int mod = num % 10;
            r += mod;
            num = num / 10;
        }
        return r;
    }
}
