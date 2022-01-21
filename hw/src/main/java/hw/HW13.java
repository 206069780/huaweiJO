package hw;

import java.util.Scanner;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName hw.HW13.java
 * @Description 句子逆序
 * @createTime 2022年01月18日 10:30:00
 */
public class HW13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        if (scan.hasNextLine()) {
            String str = scan.nextLine();

            String[] list = str.split(" ");

            for (int i = list.length-1; i >= 0; i--) {
                System.out.print(list[i]+" ");
            }
        }
    }
}
