package nc;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName NC17.java
 * @Description 最长回文子串
 * @createTime 2022年01月21日 16:48:00
 */
public class NC17 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param A string字符串
     * @return int整型
     */
    public static int getLongestPalindrome(String A) {
        // write code here
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= A.length(); i++) {
            for (int j = i; j <= A.length(); j++) {
                if (isPalindrome(A.substring(i, j))) {
                    max = Math.max(max, j - i);
                }
            }
        }

        return max;
    }

    public static boolean isPalindrome(String s) {
        for (int k = 0; k < s.length() / 2; k++) {
            if (s.charAt(k) != s.charAt(s.length() - k - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(getLongestPalindrome("aaccaa"));
    }
}
