package hw;

import java.util.*;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName hw.HW11.java
 * @Description 数字颠倒
 * @createTime 2022年01月19日 11:51:00
 */
public class HW11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt()) {
            int number = scan.nextInt();
            System.out.println(new StringBuffer(String.valueOf(number)).reverse());
        }
    }
}
