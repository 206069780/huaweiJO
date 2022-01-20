import java.util.*;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName HW85.java
 * @Description 最长回文子串
 * @createTime 2022年01月20日 11:02:00
 */
public class HW85 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            int max = 0;

            for (int i = 0; i < str.length(); i++) {
                for (int j = i; j <= str.length(); j++) {
                    if (isHw(str.substring(i, j))) {
                        max = Math.max(max, j - i);
                    }
                }
            }
            System.out.println(max);
        }
    }


    private static boolean isHw(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
