package nc;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName NC65.java
 * @Description 斐波那契数列
 * @createTime 2022年01月21日 16:05:00
 */
public class NC65 {
    public static void main(String[] args) {
        System.out.println(Fibonacci(3));
    }

    public static int Fibonacci(int n) {
        if (n < 1) return 0;
        return fibonacci(n);
    }

    private static int fibonacci(int n) {
        if (n <= 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
