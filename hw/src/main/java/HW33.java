import java.util.Scanner;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName HW33.java
 * @Description 整数与IP地址间的转换
 * @createTime 2022年01月19日 13:11:00
 */
public class HW33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println(Integer.valueOf("11101010111011010010010101101000",2));
        while (scanner.hasNextLine()) {

            StringBuffer res = null;

            String s = scanner.nextLine();

            // 如果是ip地址
            if (s.contains(".")) {

                String[] ipArr = s.split("\\.");
                res = new StringBuffer();

                for (String str : ipArr) {
                    // 确保有八位
                    String tp = "00000000" + Long.toBinaryString(Integer.parseInt(str));
                    res.append(tp.substring(tp.length() - 8));
                }
                System.out.println(Long.valueOf(res.toString(), 2));

            } else {
                // 确保有 32 位
                String ipStr = "00000000" + Long.toBinaryString(Long.parseLong(s));
                //截取 32 位
                ipStr = ipStr.substring(ipStr.length() - 32);
                res = new StringBuffer();

                while (ipStr.length() >= 8) {

                    String tmp = ipStr.substring(0, 8);
                    res.append(Long.valueOf(tmp, 2));
                    ipStr = ipStr.substring(8);

                    if (ipStr.length() >= 8) {
                        res.append(".");
                    }
                }
                System.out.println(res);
            }
        }
    }
}
