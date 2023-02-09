package hw;

import java.util.Scanner;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName GetLastStrLen.java
 * @Description 字符串最后一个单词的长度
 * @createTime 2022年01月18日 09:00:00
 */
public class HW1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        int len = getLength(s);

        System.out.print(len);

    }

    private static int getLength(String str) {

        String s = str.substring(str.lastIndexOf(" ") + 1).trim();

        return s.length();
    }

    private static int getLength2(String string) {
        int count=0;
        for (int i = string.length()-1; i >= 0; i--) {
            if (string.charAt(i) == ' ') {
                break;
            }
            count+=1;
        }

        return count;
    }
}
