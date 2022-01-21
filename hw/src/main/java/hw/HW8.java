package hw;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName hw.HW8.java
 * @Description 合并表记录
 * @createTime 2022年01月19日 16:03:00
 */
public class HW8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {

            int n = scanner.nextInt();

            //方法一
            Map<Integer, Integer> tmpMap = new HashMap<>();

            //方法二
//           TreeMap<Integer, Integer> tmpMap = new TreeMap<>();

            for (int i = 0; i < n; i++) {

                int key = scanner.nextInt();
                int value = scanner.nextInt();

                if (!tmpMap.containsKey(key)) {
                    tmpMap.put(key, value);
                } else {
                    tmpMap.put(key, tmpMap.get(key) + value);
                }
            }
            //排序
            List<Integer> keySorted = new ArrayList<>(tmpMap.keySet()).stream().sorted().collect(Collectors.toList());

            // 方法一
            for (int i : keySorted) {
                System.out.println(i + " " + tmpMap.get(i));
            }

            // 方法 二
            /*for (int i : tmpMap.keySet()) {
                System.out.println(i + " " + tmpMap.get(i));
            }*/
        }
    }
}
