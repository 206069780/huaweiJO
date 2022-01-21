package hw;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName hw.HW2.java
 * @Description 计算某字符出现次数
 * @createTime 2022年01月18日 09:21:00
 */
public class HW2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine().toUpperCase(Locale.ROOT);

        Map<Character, Integer> tmp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!tmp.containsKey(c)) {
                tmp.put(c, 1);
            } else {
                tmp.put(c, tmp.get(c) + 1);
            }
        }
        String num = scanner.next().toUpperCase(Locale.ROOT);
        int res = tmp.get(num.charAt(0)) == null ? 0 : tmp.get(num.charAt(0));
        System.out.println(res);
    }
}
