import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName HW14.java
 * @Description 字符串排序
 * @createTime 2022年01月19日 16:38:00
 */
public class HW14 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {

            List<String> stringList = new ArrayList<>();
            int n = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < n; i++) {
                stringList.add(scanner.nextLine());
            }
            stringList.stream().sorted().forEach(System.out::println);
        }
    }
}
