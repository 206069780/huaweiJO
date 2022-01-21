package zj;

import java.util.Scanner;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName ZJ16.java
 * @Description 数列的和
 * @createTime 2022年01月21日 11:30:00
 */
public class ZJ16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {

            int n = scanner.nextInt();

            int m = scanner.nextInt();

            double sum = getSqrt(m, n);

            //输出 -- 保留两位小数
            System.out.printf("%.2f\n", sum);

        }
    }

    /**
     * 获取数列和
     *
     * @param m m
     * @param n n
     * @return sum
     */
    private static double getSqrt(int m, double n) {
        if (m == 0) return 0;
        return n + getSqrt(m - 1, Math.sqrt(n));
    }
}
