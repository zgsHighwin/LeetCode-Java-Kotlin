package array;

/**
 * url:
 * Author:Savannah
 * Description:
 * 给你一个 m x n 的矩阵 matrix 。如果这个矩阵是托普利茨矩阵，返回 true ；否则，返回 false 。
 * <p>
 * 如果矩阵上每一条由左上到右下的对角线上的元素都相同，那么这个矩阵是 托普利茨矩阵 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * 输入：matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
 * 输出：true
 * 解释：
 * 在上述矩阵中, 其对角线为:
 * "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]"。
 * 各条对角线上的所有元素均相同, 因此答案是 True 。
 * 示例 2：
 * <p>
 * <p>
 * 输入：matrix = [[1,2],[2,2]]
 * 输出：false
 * 解释：
 * 对角线 "[1, 2]" 上的元素不同。
 *  
 * <p>
 * 提示：
 * <p>
 * m == matrix.length
 * n == matrix[i].length
 * 1 <= m, n <= 20
 * 0 <= matrix[i][j] <= 99
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/toeplitz-matrix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 2021/4/6
 */
public class _766_托普利茨矩阵 {
    public static void main(String[] args) {
        _766_托普利茨矩阵 v = new _766_托普利茨矩阵();
        System.out.println(v.isToeplitzMatrix(new int[][]{{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}}));
    }

    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix[0].length;
        int n = matrix.length;
        //左下
        for (int i = 0; i < n; i++) {
            int firstValue = matrix[i][0];
            int x = i + 1;
            int y = 1;
            while (x < n && y < m) {
                if (matrix[x][y] != firstValue) {
                    return false;
                }
                y++;
                x++;
            }
        }
        //右上
        for (int i = 1; i < m; i++) {
            int firstValue = matrix[0][i];
            int x = 1;
            int y = i + 1;
            while (x < n && y < m) {
                if (matrix[x][y] != firstValue) {
                    return false;
                }
                y++;
                x++;
            }
        }
        return true;
    }
}
