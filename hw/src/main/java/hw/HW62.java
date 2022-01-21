package hw;

import java.util.Scanner;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName hw.HW62.java
 * @Description 查找输入整数二进制中1的个数
 * @createTime 2022年01月18日 15:32:00
 */
public class HW62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int count = 0;
            String res = Integer.toBinaryString(n);
            for (char c : res.toCharArray()) {
                if (c == '1') {
                    ++count;
                }
            }
            System.out.println(count);
        }
    }
}
