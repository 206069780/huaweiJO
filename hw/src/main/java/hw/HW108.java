package hw;

import java.util.*;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName hw.HW108.java
 * @Description 求最小公倍数
 * @createTime 2022年01月20日 15:19:00
 */
public class HW108 {
    public static void main(String[] agrs) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int n = getGcd(a, b);
        System.out.println(a * b / n);

        scanner.close();

    }


    // 获取最大公约数
    private static int getGcd(int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a % b == 0) {
            return b;
        } else {
            return getGcd(b, a % b);
        }
    }
}
