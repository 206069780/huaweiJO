package hw;

import java.util.*;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName hw.HW9.java
 * @Description 提取不重复的整数
 * @createTime 2022年01月19日 11:18:00
 */
public class HW9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt()) {

            int number = scan.nextInt();

            String s = String.valueOf(number);

            Set<Character> sets = new HashSet<>();

            StringBuffer sb = new StringBuffer();

            // 去重处理
            for (int i = s.length() - 1; i >= 0; i--) {
                sets.add(s.charAt(i));
            }

            //重组数字
            for (int i = s.length() - 1; i >= 0; i--) {
                if (sets.contains(s.charAt(i))) {
                    sb.append(s.charAt(i));
                    sets.remove(s.charAt(i));
                }
            }
            System.out.println(sb);
        }
    }
}
