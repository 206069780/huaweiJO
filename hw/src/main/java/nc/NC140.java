package nc;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName NC140.java
 * @Description 排序
 * @createTime 2022年01月21日 16:08:00
 */
public class NC140 {
    public static int[] MySort(int[] arr) {
        // write code here
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] >= arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {5,1,6,2,5};
        MySort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
