package array;

/**
 * url:https://leetcode-cn.com/problems/minimum-time-visiting-all-points/
 * Author:Savannah
 * Description:
 * 平面上有 n 个点，点的位置用整数坐标表示 points[i] = [xi, yi]。请你计算访问所有这些点需要的最小时间（以秒为单位）。
 * <p>
 * 你可以按照下面的规则在平面上移动：
 * <p>
 * 每一秒沿水平或者竖直方向移动一个单位长度，或者跨过对角线（可以看作在一秒内向水平和竖直方向各移动一个单位长度）。
 * 必须按照数组中出现的顺序来访问这些点。
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * 输入：points = [[1,1],[3,4],[-1,0]]
 * 输出：7
 * 解释：一条最佳的访问路径是： [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> [1,2] -> [0,1] -> [-1,0]
 * 从 [1,1] 到 [3,4] 需要 3 秒
 * 从 [3,4] 到 [-1,0] 需要 4 秒
 * 一共需要 7 秒
 * 示例 2：
 * <p>
 * 输入：points = [[3,2],[-2,2]]
 * 输出：5
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-time-visiting-all-points
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 6/16/20
 */
public class _1266_访问所有点的最小时间 {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int c = 0;
        if(points.length==1){
            return 1;
        }
        for (int i = 1; i < points.length; i++) {
            int px = points[i - 1][0];
            int py = points[i - 1][1];
            int nx = points[i][0];
            int ny = points[i][1];
            c += Math.max(Math.abs(nx - px), Math.abs(ny - py));
        }
        return c;
    }

    public static void main(String[] args) {
        int[][] res = {{3,2}, {-2,2}};
        System.out.println(minTimeToVisitAllPoints(res));
    }
}
