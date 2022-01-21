package hw;

import java.util.Scanner;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName hw.HW7.java
 * @Description 取近似值
 * @createTime 2022年01月19日 12:51:00
 */
public class HW7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextFloat()) {

            System.out.println(Math.round(scan.nextFloat()));

        }
    }
}
