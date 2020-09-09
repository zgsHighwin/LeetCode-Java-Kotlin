package bitmanipulation;

import java.util.HashSet;

/**
 * url:https://leetcode-cn.com/problems/single-number/
 * Author:Savannah
 * Description:给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 * <p>
 * 说明：
 * <p>
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 * <p>
 * 示例 1:
 * <p>
 * 输入: [2,2,1]
 * 输出: 1
 * 示例 2:
 * <p>
 * 输入: [4,1,2,1,2]
 * 输出: 4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/single-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/7/20
 */
public class _136_只出现一次的数字 {
    public static int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }
        return set.iterator().next();
    }
// 官方的方式，
//    任何数和 00 做异或运算，结果仍然是原来的数，即 a \oplus 0=aa⊕0=a。
//    任何数和其自身做异或运算，结果是 00，即 a \oplus a=0a⊕a=0。
//    异或运算满足交换律和结合律，即 a \oplus b \oplus a=b \oplus a \oplus a=b \oplus (a \oplus a)=b \oplus0=ba⊕b⊕a=b⊕a⊕a=b⊕(a⊕a)=b⊕0=b。
//
//    作者：LeetCode-Solution
//    链接：https://leetcode-cn.com/problems/single-number/solution/zhi-chu-xian-yi-ci-de-shu-zi-by-leetcode-solution/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
//    public int singleNumber(int[] nums) {
//        int single = 0;
//        for (int num : nums) {
//            single ^= num;
//        }
//        return single;
//    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{1,2,3,3,2}));
    }
}
