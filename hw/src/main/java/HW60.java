import java.util.Scanner;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName HW60.java
 * @Description 查找组成一个偶数最接近的两个素数
 * @createTime 2022年01月20日 15:58:00
 */
public class HW60 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {

            int a = 0, b = 0, max = Integer.MAX_VALUE;

            int n = scanner.nextInt();

            for (int i = 1; i <= n / 2; i++) {
                //判断是否都为素数
                if (isPrime(i) && isPrime(n - i)) {

                    //判断二者之间的间隔
                    if (Math.abs((n - i) - i) < max) {
                        a = i;
                        b = n - i;
                        max = Math.abs(a - b);
                    }
                }
            }
            System.out.println(a + "\n" + b);
        }
    }

    /**
     * 判断是否问素数
     *
     * @param n 数字
     * @return false 非素数 true 素数
     */
    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
