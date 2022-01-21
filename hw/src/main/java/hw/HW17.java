package hw;

import java.util.Scanner;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName hw.HW17.java
 * @Description 坐标移动
 * @createTime 2022年01月18日 13:20:00
 */
public class HW17 {
    /**
     * A : 左移
     * D : 右移
     * W : 上移
     * S : 下移
     *
     * @param args
     */
    public static void main(String[] args) {

        int[] arr = {0, 0};

        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();

//        System.out.println(str);
        String[] zb = str.split(";");

        for (String s : zb) {
            if (!"".equals(s))
                switch (s.substring(0, 1)) {
                    case "A":
                        leftMove(arr, parseInt(s.substring(1)));
                        break;
                    case "D":
                        rightMove(arr, parseInt(s.substring(1)));
                        break;
                    case "W":
                        upMove(arr, parseInt(s.substring(1)));
                        break;
                    case "S":
                        donMove(arr, parseInt(s.substring(1)));
                        break;

                }
        }
        System.out.println(arr[0] + "," + arr[1]);

    }

    /**
     * 判断移动步数是否有效
     *
     * @param s 步数字符串
     * @return 移动步数
     */
    private static int parseInt(String s) {

        for (char c : s.toCharArray()) {
            //如果存在非数字的字符 ,直接返回 0
            if (c < '0' || c > '9') {
                return 0;
            }
        }
        return Integer.parseInt(s);
    }

    /**
     * 左移动
     *
     * @param arr  坐标
     * @param step 移动步数
     */
    private static void leftMove(int[] arr, int step) {
        arr[0] = arr[0] - step;
    }

    /**
     * 右移动
     *
     * @param arr  坐标
     * @param step 移动步数
     */
    private static void rightMove(int[] arr, int step) {
        arr[0] = arr[0] + step;
    }

    /**
     * 上移动
     *
     * @param arr  坐标
     * @param step 移动步数
     */
    private static void upMove(int[] arr, int step) {
        arr[1] = arr[1] + step;
    }

    /**
     * 下移动
     *
     * @param arr  坐标
     * @param step 移动步数
     */
    private static void donMove(int[] arr, int step) {
        arr[1] = arr[1] - step;
    }
}
