package hw;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName hw.HW5.java
 * @Description 进制转换
 * @createTime 2022年01月18日 10:51:00
 */
public class HW5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> map0x = new HashMap<>();
        map0x.put('A', 10);
        map0x.put('B', 11);
        map0x.put('C', 12);
        map0x.put('D', 13);
        map0x.put('E', 14);
        map0x.put('F', 15);
        map0x.put('1', 1);
        map0x.put('2', 2);
        map0x.put('3', 3);
        map0x.put('4', 4);
        map0x.put('5', 5);
        map0x.put('6', 6);
        map0x.put('7', 7);
        map0x.put('8', 8);
        map0x.put('9', 9);
        map0x.put('0', 0);

        while (scanner.hasNext()) {
            String str = scanner.next();
            str = str.substring(2).toUpperCase(Locale.ROOT);
            int res = 0;
            for (int i = str.length() - 1; i >= 0; i--) {
                res += map0x.get(str.charAt(i)) * Math.pow(16, str.length() - 1 - i);
            }
            System.out.println(res);
        }
    }
}
