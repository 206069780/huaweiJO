package hw;

import java.util.Scanner;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName hw.HW20.java
 * @Description 密码验证合格程序
 * @createTime 2022年01月18日 15:47:00
 */
public class HW20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {

            String password = scanner.nextLine();

            char[] chars = password.toCharArray();

//            Pattern number = Pattern.compile("[0-9]");
//            Pattern minChar = Pattern.compile("[a-z]");
//            Pattern bigChar = Pattern.compile("[A-Z]");
//            Pattern oChar = Pattern.compile("[^a-zA-Z0-9]");

            if (password.length() > 8) {
                int a = 0, b = 0, e = 0, d = 0;
                boolean err = true;
                for (char c : chars) {
                    // 数字
                    if (c >= '0' && c <= '9') {
                        a = 1;
                    } else if (c >= 'a' && c <= 'z') {
                        b = 1;
                    } else if (c >= 'A' && c <= 'Z') {
                        d = 1;
                    } else if (c == ' ' || c == '\n') {
                        //存在空格或换行
                        err = false;
                        break;
                    } else {
                        e = 1;
                    }
                }
                if (err) {
                    if ((a + b + d + e) >= 3) {
                        if (reStr(password)) {
                            System.out.println("OK");
                        } else {
                            // 重复字符串
                            System.out.println("NG");
                        }
                    } else {
                        // 字符种类小于三种
                        System.out.println("NG");
                    }
                } else {
                    //存在空格
                    System.out.println("NG");
                }
            } else {
                // 长度小于等于8
                System.out.println("NG");
            }
        }
    }

    private static boolean reStr(String s) {
        for (int i = 3; i < s.length(); i++) {
            if (s.substring(i).contains(s.substring(i - 3, i))) {
                return false;
            }
        }
        return true;
    }
}
