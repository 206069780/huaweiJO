package hw;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName hw.HW3.java
 * @Description 明明的随机数
 * @createTime 2022年01月18日 09:37:00
 */
public class HW3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNextInt()) {

            int n = scan.nextInt();

            //实现自动排序
            TreeSet<Integer> treeSet = new TreeSet<>();

            //添加数据
            for (int i = 0; i < n; i++) {
                treeSet.add(scan.nextInt());
            }

            Iterator iterator = treeSet.iterator();

            // 输出数据
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
    }
}
