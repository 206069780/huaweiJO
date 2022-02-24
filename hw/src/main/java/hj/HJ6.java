package hj;

import java.util.Scanner;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName hj.HJ6.java
 * @Description 质数因子
 * @createTime 2022年02月24日 09:52:00
 */
public class HJ6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {

            int num = scanner.nextInt();
            primeNumbers(num);

        }
    }

    // 获取质数因子
    public static void primeNumbers(int num) {

        int k = (int) Math.sqrt(num);

        for (int i = 2; i <= k; i++) {
            while (i != num) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                    num = num / i;
                } else {
                    break;
                }
            }
        }
        System.out.println(num);
    }
}
