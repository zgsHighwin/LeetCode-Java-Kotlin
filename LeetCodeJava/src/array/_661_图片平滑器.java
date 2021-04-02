package array;

import java.util.Arrays;

/**
 * url:https://leetcode-cn.com/problems/image-smoother/
 * Author:Savannah
 * Description:
 * 包含整数的二维矩阵 M 表示一个图片的灰度。你需要设计一个平滑器来让每一个单元的灰度成为平均灰度 (向下舍入) ，平均灰度的计算是周围的8个单元和它本身的值求平均，如果周围的单元格不足八个，则尽可能多的利用它们。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * [[1,1,1],
 * [1,0,1],
 * [1,1,1]]
 * 输出:
 * [[0, 0, 0],
 * [0, 0, 0],
 * [0, 0, 0]]
 * 解释:
 * 对于点 (0,0), (0,2), (2,0), (2,2): 平均(3/4) = 平均(0.75) = 0
 * 对于点 (0,1), (1,0), (1,2), (2,1): 平均(5/6) = 平均(0.83333333) = 0
 * 对于点 (1,1): 平均(8/9) = 平均(0.88888889) = 0
 * 注意:
 * <p>
 * 给定矩阵中的整数范围为 [0, 255]。
 * 矩阵的长和宽的范围均为 [1, 150]。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/image-smoother
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 2021/4/1
 */
public class _661_图片平滑器 {
    public static void main(String[] args) {
//        [[1,2,3,4,5],[9,9,9,9,9],[7,7,7,7,7],[9,9,9,9,9],[8,7,8,8,8],[9,8,8,9,1]]
        _661_图片平滑器 obj = new _661_图片平滑器();
        int[][] imageSmoother = obj.imageSmoother(new int[][]{{1, 2, 3, 4, 5}, {9, 9, 9, 9, 9}, {7, 7, 7, 7, 7},{9,9,9,9,9}, {8, 7, 8, 8, 8}, {9, 8, 8, 9, 1}});
        System.out.println(Arrays.deepToString(imageSmoother));
    }

    public int[][] imageSmoother(int[][] M) {
        int[][] arr = new int[M.length][];
        for (int i = 0; i < M.length; i++) {
            arr[i] = new int[M[i].length];
            for (int j = 0; j < M[i].length; j++) {
                arr[i][j] = M[i][j];
            }
        }

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                arr[i][j] = calculateAverage(i, j, M.length, M[i].length, M);
            }
        }
        return arr;
    }

    private int calculateAverage(int i, int j, int rowLength, int columnLength, int[][] M) {
        int divider = 0;
        int total = 0;
        int topLayer = i - 1;
        int bottomLayer = i + 1;
        int leftLayer = j - 1;
        int rightLayer = j + 1;
        //左上
        if (topLayer >= 0 && leftLayer >= 0) {
            total += M[topLayer][leftLayer];
            divider++;
        }
        //上面
        if (topLayer >= 0) {
            total += M[topLayer][j];
            divider++;
        }
        //左边
        if (leftLayer >= 0) {
            total += M[i][leftLayer];
            divider++;
        }
        //自己
        total += M[i][j];
        divider++;
        //左下
        if (bottomLayer < rowLength && leftLayer >= 0) {
            total += M[bottomLayer][leftLayer];
            divider++;

        }
        //下面
        if (bottomLayer < rowLength) {
            total += M[bottomLayer][j];
            divider++;
        }
        //右边
        if (rightLayer < columnLength) {
            total += M[i][rightLayer];
            divider++;
        }
        //右上
        if (topLayer >= 0 && rightLayer < columnLength) {
            total += M[topLayer][rightLayer];
            divider++;
        }
        //右下
        if (bottomLayer < rowLength && rightLayer < columnLength) {
            total += M[bottomLayer][rightLayer];
            divider++;
        }
        return total / divider;
    }
}
