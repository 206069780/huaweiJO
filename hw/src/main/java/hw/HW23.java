package hw;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName hw.HW23.java
 * @Description 删除字符串中出现次数最少的字符
 * @createTime 2022年01月18日 17:16:00
 */
public class HW23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {

            String str = scanner.next();

            Map<Character, Integer> tmp = new HashMap<>();

            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < str.length(); i++) {
                if (tmp.containsKey((char) str.charAt(i))) {
                    tmp.put((char) str.charAt(i), tmp.get((char) str.charAt(i)) + 1);
                } else {
                    tmp.put((char) str.charAt(i), 1);
                }
            }
//            System.out.println(tmp);
            // 找出最少
            int min = Integer.MAX_VALUE;
            for (int a : tmp.values()) {
                min = Math.min(min, a);
            }

            for (int i = 0; i < str.length(); i++) {
                if (!(min == tmp.get(str.charAt(i)))) {
                    sb.append(str.charAt(i));
                }
            }
            System.out.println(sb);
        }
    }
}
