package array;

import java.util.List;

/**
 * url:
 * Author:Savannah
 * Description:给你一个数组 items ，其中 items[i] = [typei, colori, namei] ，描述第 i 件物品的类型、颜色以及名称。
 * <p>
 * 另给你一条由两个字符串 ruleKey 和 ruleValue 表示的检索规则。
 * <p>
 * 如果第 i 件物品能满足下述条件之一，则认为该物品与给定的检索规则 匹配 ：
 * <p>
 * ruleKey == "type" 且 ruleValue == typei 。
 * ruleKey == "color" 且 ruleValue == colori 。
 * ruleKey == "name" 且 ruleValue == namei 。
 * 统计并返回 匹配检索规则的物品数量 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
 * 输出：1
 * 解释：只有一件物品匹配检索规则，这件物品是 ["computer","silver","lenovo"] 。
 * 示例 2：
 * <p>
 * 输入：items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
 * 输出：2
 * 解释：只有两件物品匹配检索规则，这两件物品分别是 ["phone","blue","pixel"] 和 ["phone","gold","iphone"] 。注意，["computer","silver","phone"] 未匹配检索规则。
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= items.length <= 104
 * 1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10
 * ruleKey 等于 "type"、"color" 或 "name"
 * 所有字符串仅由小写字母组成
 * 通过次数9,628提交次数11,371
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/count-items-matching-a-rule
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 2021/3/26
 */
public class _1773_统计匹配检索规则的物品数量 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int index = -1;
        if ("type".equals(ruleKey)) {
            index = 0;
        }
        if ("color".equals(ruleKey)) {
            index = 1;
        }
        if ("name".equals(ruleKey)) {
            index = 2;
        }
        int r = 0;
        for (List<String> item : items) {
            String value = item.get(index);
            if (value == null) {
                continue;
            }
            if (value.equals(ruleValue)) {
                r++;
            }
        }
        return r;
    }
}
