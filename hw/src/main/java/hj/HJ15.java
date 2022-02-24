package hj;

import java.util.Scanner;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName HJ15.java
 * @Description 求int型正整数在内存中存储时1的个数
 * @createTime 2022年02月24日 11:48:00
 */
public class HJ15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            int sum = 0;
            String res = Integer.toBinaryString(num);
            for (int i = 0; i < res.length(); i++) {
                if (res.charAt(i) == '1') {
                    sum+=1;
                }
            }
            System.out.println(sum);

        }
    }
}
