package nc;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName NC68.java
 * @Description 跳台阶
 * @createTime 2022年01月21日 16:25:00
 */
public class NC68 {
    public static int jumpFloor(int n) {
        if (n < 3) return n;
        return jumpFloor(n - 1) + jumpFloor(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(jumpFloor(2));
    }
}
