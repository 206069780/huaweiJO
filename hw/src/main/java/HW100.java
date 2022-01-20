import java.util.Scanner;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName HW100.java
 * @Description 等差数列
 * @createTime 2022年01月20日 15:25:00
 */
public class HW100 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {

            int n = scanner.nextInt();

            //和
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += fun(i);
            }
            System.out.println(sum);
        }
    }

    /**
     * 获取第 n个的值
     *
     * @param n 位置
     * @return n的值
     */
    private static int fun(int n) {

        if (n == 1) {
            return 2;
        }
        return 3 + fun(n - 1);
    }
}
