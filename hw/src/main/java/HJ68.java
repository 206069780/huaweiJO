import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName HJ68.java
 * @Description 成绩排序
 * @createTime 2022年01月19日 16:50:00
 */
public class HJ68 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = Integer.parseInt(scanner.next());
            int sort = Integer.parseInt(scanner.next());
            Map<String, Integer> table = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String name = scanner.next();
                int cord = Integer.parseInt(scanner.next());
                table.put(name, cord);
            }
            table.entrySet().stream().sorted((k1, k2) -> {
                if (sort == 1) {
                    if (k1.getValue() != k2.getValue())
                        return k1.getValue() - k2.getValue();
                    return 0;
                } else {
                    if (k1.getValue() != k2.getValue())
                        return k2.getValue() - k1.getValue();
                    return -1;
                }
            }).collect(Collectors.toList()).forEach(entry -> {
                System.out.println(entry.getKey() + " " + entry.getValue());
            });
        }
    }
}
