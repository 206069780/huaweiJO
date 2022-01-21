package nc;

import java.util.Arrays;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName NC22.java
 * @Description 合并两个有序的数组
 * @createTime 2022年01月21日 16:31:00
 */
public class NC22 {

    public static void merge(int A[], int m, int B[], int n) {
        for (int i = 0; i < n; i++) {
            A[m + i] = B[i];
        }
        Arrays.sort(A);
    }

    public static void main(String[] args) {
        int a[] = {4, 5, 6,0,0,0};
        int b[] = {1, 2, 3};
        merge(a, 3, b, b.length);
        for (int i: a){
            System.out.print(i+" ");
        }
    }
}
