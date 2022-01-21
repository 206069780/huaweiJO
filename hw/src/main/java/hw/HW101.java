package hw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName hw.HW101.java
 * @Description 输入整型数组和排序标识，对其元素按照升序或降序进行排序
 * @createTime 2022年01月19日 15:01:00
 */
public class HW101 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                res.add(scanner.nextInt());
            }

            int sort = scanner.nextInt();

            // 升序
            if (sort == 0) {
                res.sort(Comparator.comparing(integer -> integer));
            } else {
               res.sort(Comparator.reverseOrder());
            }
            res.forEach(i->System.out.print(i+" "));
        }
    }
}
