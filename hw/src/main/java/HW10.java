import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName HW10.java
 * @Description 字符个数统计
 * @createTime 2022年01月18日 13:10:00
 */
public class HW10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

        char[] chars = str.toCharArray();

        Set<Character> result= new HashSet<>();

        for (char c : chars) {
            result.add(c);
        }
        System.out.println(result.size());
    }
}
