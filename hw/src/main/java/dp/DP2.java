package dp;

import java.util.Scanner;

/**
 * @author FuDaoPin
 * @version 1.0.0
 * @ClassName DP2.java
 * @Description 跳台阶
 * @createTime 2022年03月03日 20:01:00
 */
public class DP2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {

            int n  = scanner.nextInt();

            int [] dp =new int[n+1];
            dp[1]=1;

            if (n >= 2) {
                dp[2]=2;
                for(int i = 3;i <= n;++i){
                    for(int j = 1;j < i;++j)
                        dp[i] += dp[j];
                    dp[i] += 1;
                }
            }
            System.out.println(dp[n]);
        }

    }
}
