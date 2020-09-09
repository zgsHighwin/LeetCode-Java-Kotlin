package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * url:https://leetcode-cn.com/problems/destination-city/
 * Author:Savannah
 * Description:
 * <p>
 * 给你一份旅游线路图，该线路图中的旅行线路用数组 paths 表示，其中 paths[i] = [cityAi, cityBi] 表示该线路将会从 cityAi 直接前往 cityBi 。请你找出这次旅行的终点站，即没有任何可以通往其他城市的线路的城市。
 * <p>
 * 题目数据保证线路图会形成一条不存在循环的线路，因此只会有一个旅行终点站。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
 * 输出："Sao Paulo"
 * 解释：从 "London" 出发，最后抵达终点站 "Sao Paulo" 。本次旅行的路线是 "London" -> "New York" -> "Lima" -> "Sao Paulo" 。
 * 示例 2：
 * <p>
 * 输入：paths = [["B","C"],["D","B"],["C","A"]]
 * 输出："A"
 * 解释：所有可能的线路是：
 * "D" -> "B" -> "C" -> "A".
 * "B" -> "C" -> "A".
 * "C" -> "A".
 * "A".
 * 显然，旅行终点站是 "A" 。
 * 示例 3：
 * <p>
 * 输入：paths = [["A","Z"]]
 * 输出："Z"
 * LeetCodeTesting 7/2/20
 */
public class _1436_旅行终点站 {
    public static String destCity(List<List<String>> paths) {

        HashSet<String> hashSet = new HashSet<>();
        for (List<String> path : paths) {
            hashSet.add(path.get(0));
        }

        for (List<String> path : paths) {
            String value1 = path.get(1);
            if (!hashSet.contains(value1)) {
                return value1;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        List<List<String>> out = new ArrayList<>();
        List<String> city1 = new ArrayList<>();
        city1.add("London");
        city1.add("New York");
        List<String> city2 = new ArrayList<>();
        city2.add("New York");
        city2.add("Lima");
        List<String> city3 = new ArrayList<>();
        city3.add("Lima");
        city3.add("Sao Paulo");
        out.add(city1);
        out.add(city2);
        out.add(city3);
        System.out.println(destCity(out));
    }
}
