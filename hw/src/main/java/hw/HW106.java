package hw;

import java.util.Scanner;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName hw.HW106.java
 * @Description 字符逆序
 * @createTime 2022年01月18日 15:40:00
 */
public class HW106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            char[] arr = str.toCharArray();

            StringBuffer sb = new StringBuffer();

            for (int i = arr.length - 1; i >= 0; i--) {
                sb.append(arr[i]);
            }
            System.out.print(sb);
        }
    }
}
