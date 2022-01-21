package hw;

import java.util.*;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName hw.HW72.java
 * @Description 百钱买百鸡问题
 * @createTime 2022年01月20日 17:29:00
 */
public class HW72 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String s = sc.nextLine();

            for (int x = 0; x < 20; x++) {
                for (int y = 0; y < 33; y++) {
                    for (int z = 0; z < 100; z = z + 3) {

                        if ((x + y + z) == 100 && (x * 5 + y * 3 + z / 3) == 100) {

                            System.out.println(x + " " + y + " " + z);
                        }
                    }
                }
            }
        }
    }
}
