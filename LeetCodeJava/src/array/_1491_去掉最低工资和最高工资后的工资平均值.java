package array;

/**
 * url:https://leetcode-cn.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 * Author:Savannah
 * Description:
 * 给你一个整数数组 salary ，数组里每个数都是 唯一 的，其中 salary[i] 是第 i 个员工的工资。
 * <p>
 * 请你返回去掉最低工资和最高工资以后，剩下员工工资的平均值。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：salary = [4000,3000,1000,2000]
 * 输出：2500.00000
 * 解释：最低工资和最高工资分别是 1000 和 4000 。
 * 去掉最低工资和最高工资以后的平均工资是 (2000+3000)/2= 2500
 * 示例 2：
 * <p>
 * 输入：salary = [1000,2000,3000]
 * 输出：2000.00000
 * 解释：最低工资和最高工资分别是 1000 和 3000 。
 * 去掉最低工资和最高工资以后的平均工资是 (2000)/1= 2000
 * 示例 3：
 * <p>
 * 输入：salary = [6000,5000,4000,3000,2000,1000]
 * 输出：3500.00000
 * 示例 4：
 * <p>
 * 输入：salary = [8000,9000,2000,3000,6000,1000]
 * 输出：4750.00000
 *  
 * <p>
 * 提示：
 * <p>
 * 3 <= salary.length <= 100
 * 10^3 <= salary[i] <= 10^6
 * salary[i] 是唯一的。
 * 与真实值误差在 10^-5 以内的结果都将视为正确答案。
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/average-salary-excluding-the-minimum-and-maximum-salary
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/25/20
 */
public class _1491_去掉最低工资和最高工资后的工资平均值 {
    public double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        int sum = salary[0];
        for (int i = 1; i < salary.length; i++) {
            if (salary[i] < min) {
                min = salary[i];
            }
            if (salary[i] > max) {
                max = salary[i];
            }
            sum += salary[i];
        }
        return (double) (sum - min - max) / (salary.length - 2);
    }
}
