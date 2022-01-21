package hw;

import java.util.*;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName hw.HW41.java
 * @Description 称砝码
 * @createTime 2022年01月20日 09:13:00
 */
public class HW41 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            // 输出 砝码个数
            int n = scanner.nextInt();

            // 砝码重量
            int[] w = new int[n];
            for (int i = 0; i < n; i++) {
                w[i] = scanner.nextInt();
            }

            // 砝码数量n
            int[] h = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = scanner.nextInt();
            }

            Set<Integer> res = new HashSet<>();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        res.add(i * w[j] * h[k]);
                    }
                }
            }
            System.out.println(res.size()+1);

        }
    }
}
