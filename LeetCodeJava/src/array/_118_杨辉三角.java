package array;

import java.util.ArrayList;
import java.util.List;

/**
 * url:https://leetcode-cn.com/problems/pascals-triangle/
 * Author:Savannah
 * Description:
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * <p>
 * <p>
 * <p>
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 * <p>
 * 示例:
 * <p>
 * 输入: 5
 * 输出:
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 * 通过次数106,955提交次数158,564
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/pascals-triangle
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/24/20
 */
public class _118_杨辉三角 {
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> outL = new ArrayList<>();
        if (numRows < 1) {
            return outL;
        }

        List<Integer> l = new ArrayList<>();
        l.add(1);
        outL.add(l);

        if (numRows == 1) {
            return outL;
        }

        for (int i = 1; i < numRows; i++) {
            List<Integer> preL = outL.get(i - 1);
            List<Integer> currL = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (j == 0 || j == i) {
                    currL.add(1);
                } else {
                    currL.add(preL.get(j - 1) + preL.get(j));
                }
            }
            outL.add(currL);
        }
        return outL;
    }

    public static void main(String[] args) {
        System.out.println(generate(1));
        System.out.println(generate(2));
        System.out.println(generate(3));
        System.out.println(generate(4));
        System.out.println(generate(5));
        System.out.println(generate(20));
    }
}
