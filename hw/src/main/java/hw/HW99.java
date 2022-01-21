package hw;

import java.util.Scanner;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName hw.HW99.java
 * @Description 自守数
 * @createTime 2022年01月20日 16:56:00
 */
public class HW99 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt()) {

            int n = scan.nextInt();

            int count = v1(n);

            System.out.println(count);

        }

        scan.close();
    }

    /**
     * 取模运算
     *
     * @param n
     * @return 数量
     */
    private static int v1(int n) {

        int sqr = 10, count = 0;

        for (int i = 0; i <= n; i++) {
            if (i >= sqr) {
                sqr *= 10;
            }
            if (Math.pow(i, 2) % sqr == i) {
                ++count;
            }
        }
        return count;
    }

    /**
     * 字符串运算
     *
     * @param n
     * @return
     */
    private static int v2(int n) {
        return 0;

    }
}
