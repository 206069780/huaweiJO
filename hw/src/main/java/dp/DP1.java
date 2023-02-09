package dp;

import java.util.Scanner;

/**
 * @author FuDaoPin
 * @version 1.0.0
 * @ClassName DP1.java
 * @Description 斐波那契数列
 * @createTime 2022年03月03日 19:08:00
 */
public class DP1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {

            int n = scanner.nextInt();

            int[] arr = new int[n];
            if (n <= 2 && n > 0) {
                System.out.println(1);
            }else if (n <= 0) {
                System.out.println(0);
            }
            else {
//            arr[0]=1;
                arr[0] = arr[1] = 1;

                for (int i = 2; i < n; i++) {
                    arr[i] = arr[i - 1] + arr[i - 2];
                }
                System.out.println(arr[n - 1]);
            }

        }
    }
}
