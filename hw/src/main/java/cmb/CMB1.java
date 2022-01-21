package cmb;

import java.util.Scanner;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName CMB1.java
 * @Description 序列找数
 * @createTime 2022年01月21日 14:17:00
 */
public class CMB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += scanner.nextInt();
            }
            System.out.println( (1 + n) * n / 2 - sum);
        }
    }
}
