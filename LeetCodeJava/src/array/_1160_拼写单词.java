package array;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * url:https://leetcode-cn.com/problems/find-words-that-can-be-formed-by-characters/
 * Author:Savannah
 * Description:
 * 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
 * <p>
 * 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
 * <p>
 * 注意：每次拼写（指拼写词汇表中的一个单词）时，chars 中的每个字母都只能用一次。
 * <p>
 * 返回词汇表 words 中你掌握的所有单词的 长度之和。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：words = ["cat","bt","hat","tree"], chars = "atach"
 * 输出：6
 * 解释：
 * 可以形成字符串 "cat" 和 "hat"，所以答案是 3 + 3 = 6。
 * 示例 2：
 * <p>
 * 输入：words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 * 输出：10
 * 解释：
 * 可以形成字符串 "hello" 和 "world"，所以答案是 5 + 5 = 10。
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= words.length <= 1000
 * 1 <= words[i].length, chars.length <= 100
 * 所有字符串中都仅包含小写英文字母
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-words-that-can-be-formed-by-characters
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * LeetCodeTesting 9/25/20
 */
public class _1160_拼写单词 {

    public static int countCharacters(String[] words, String chars) {
        int[] ints = new int[26];
        char[] c = chars.toCharArray();
        for (char value : c) {
            ++ints[value - 'a'];
        }

        int sum = 0;
        for (String word : words) {
            boolean ok = true;
            char[] c1 = word.toCharArray();
            int l = word.length();
            for (int i = 0; i < c1.length; i++) {
                if (ints[c1[i]-'a'] == 0) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                sum += l;
            }
        }
        return sum;
    }
//    public static int countCharacters(String[] words, String chars) {
//        ArrayList<String> list = new ArrayList<>();
//        char[] c = chars.toCharArray();
//        HashSet<Object> set = new HashSet<>();
//        for (char c1 : c) {
//            set.add(c1);
//        }
//
//        for (String word : words) {
//            char[] c2 = word.toCharArray();
//
//            boolean ok = true;
//            for (char c3 : c2) {
//                if(!set.contains(c3)){
//                    ok = false;
//                    break;
//                }
////                if (!chars.contains(String.valueOf(c3))) {
////                    ok = false;
////                    break;
////                }
//            }
//            if (ok) {
//                list.add(word);
//            }
//        }
//
//        int sum = 0;
//        for (String s : list) {
//            sum += s.length();
//        }
//        return sum;
//    }

    public static void main(String[] args) {
        System.out.println(countCharacters(new String[]{"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin", "ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb", "ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl", "boygirdlggnh", "xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx", "nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop", "hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx", "juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr", "lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo", "oxgaskztzroxuntiwlfyufddl", "tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp", "qnagrpfzlyrouolqquytwnwnsqnmuzphne", "eeilfdaookieawrrbvtnqfzcricvhpiv", "sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz", "yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue", "hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv", "cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo", "teyygdmmyadppuopvqdodaczob", "qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs", "qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"}, "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp"));
    }
}
