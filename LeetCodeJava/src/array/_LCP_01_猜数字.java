package array;

/**
 * url:
 * Author:Savannah
 * Description:
 * LeetCodeTesting 6/10/20
 */
public class _LCP_01_猜数字 {
    public static int game(int[] guess, int[] answer) {
        int i = 0;
        for (int j = 0; j < guess.length; j++) {
            if (guess[j] == answer[j]) {
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(game(new int[]{1, 2, 3}, new int[]{1,2,3}));
    }
}
