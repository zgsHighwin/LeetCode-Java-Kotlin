package array;

/**
 * url:https://leetcode-cn.com/problems/matrix-diagonal-sum/
 * Author:Savannah
 * Description:
 * 给你一个正方形矩阵 mat，请你返回矩阵对角线元素的和。
 * <p>
 * 请你返回在矩阵主对角线上的元素和副对角线上且不在主对角线上元素的和。
 * <p>
 *  
 * <p>
 * 示例  1：
 * <p>
 * <p>
 * <p>
 * 输入：mat = [[1,2,3],
 *             [4,5,6],
 *             [7,8,9]]
 * 输出：25
 * 解释：对角线的和为：1 + 5 + 9 + 3 + 7 = 25
 * 请注意，元素 mat[1][1] = 5 只会被计算一次。
 * 示例  2：
 * <p>
 * 输入：mat = [[1,1,1,1],
 *             [1,1,1,1],
 *             [1,1,1,1],
 *             [1,1,1,1]]
 * 输出：8
 * 示例 3：
 * <p>
 * 输入：mat = [[5]]
 * 输出：5
 *  
 * <p>
 * 提示：
 * <p>
 * n == mat.length == mat[i].length
 * 1 <= n <= 100
 * 1 <= mat[i][j] <= 100
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/matrix-diagonal-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 2021/3/24
 */
public class _1572_矩阵对角线元素的和 {
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        if ((mat.length & 1) == 1) {
            sum += mat[mat.length >> 1][mat[mat.length >> 1].length >> 1];
        }
        for (int i = 0; i < mat.length >> 1; i++) {
            int[] rowArray = mat[i];
            int[] rowArrayBottom = mat[mat.length - 1 - i];
            sum += rowArray[i] + rowArray[rowArray.length - 1 - i];
            sum += rowArrayBottom[i] + rowArrayBottom[rowArrayBottom.length - 1 - i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(diagonalSum(new int[][]{{1, 2, 3, 4, 5}, {4, 5, 6, 7, 8}, {7, 8, 9, 10, 11}, {12, 13, 14, 15, 16}, {17, 18, 19, 20, 21}}));
    }
}
