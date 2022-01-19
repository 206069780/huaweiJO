import java.util.Scanner;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName HW4.java
 * @Description 字符串分隔
 * @createTime 2022年01月18日 09:39:00
 */
public class HW4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String s = scanner.next();

            while (s.length() >= 8) {
                System.out.println(s.substring(0, 8));
                s = s.substring(8);
            }

            if (s.length() < 8) {
                s = s + "00000000";
                System.out.println(s.substring(0, 8));
            }
        }

    }

    public void v1() {

        Scanner scanner = new Scanner(System.in);
        String s = "";
        while (true) {
            if (scanner.hasNext()) {
                s = scanner.next();
            }
            StringBuffer res = new StringBuffer();
            for (int i = 0; i < s.length(); i++) {
                res.append(s.charAt(i));
                if (res.length() == 8) {
                    System.out.println(res.toString());
                    res = new StringBuffer();
                }
            }
            while (res.length() < 8) {
                res.append(0);
            }

//            if (!(res.length() < 8)) {
            System.out.println(res.toString());
//            }
        }
    }
}
