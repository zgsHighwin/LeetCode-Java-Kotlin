package string;

/**
 * url:https://leetcode-cn.com/problems/palindrome-number/
 * Author:Savannah
 * Description:
 * LeetCodeTesting 6/10/20
 */
public class _9_回文数 {
    public static boolean isPalindrome(int x) {
        int temp = 0;
        int v=x;
        while (x!=0){
            temp = temp*10+x%10;
            x = x/10;
        }
        return temp==v;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
}
