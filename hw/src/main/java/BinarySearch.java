

/**
 * @author FuDaoPin
 * @version 1.0.0
 * @ClassName BinarySearch.java
 * @Description 二分查找方法
 * @createTime 2022年02月25日 15:46:00
 */
public class BinarySearch {
    public static void main(String[] args) {

        int[] array = {3, 5, 11, 17, 21, 23, 28, 30, 32, 50, 64, 78, 81, 95, 101};

//        System.out.println(binarySearch(array, -1));
        System.out.println(recursionBinarySearch(array, 0, array.length, 101));

    }

    /**
     * 遍历 迭代
     *
     * @param array 原数组
     * @param target 查找的数据
     * @return 查找结果
     */
    public static int binarySearch(int[] array, int target) {
        int left = -1;
        int right = array.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (array[mid] < target) {
                left = mid;
            }
            if (array[mid] > target) {
                right = mid;
            }
            if (array[mid] == target) {
                return mid;
            }
        }
        return -1;
    }

    /**
     * 递归 二分查找
     * @param array 原数组
     * @param left 开始索引
     * @param right 结束索引
     * @param target 目标元素
     * @return 返回结果
     */
    public static int recursionBinarySearch(int[] array, int left, int right, int target) {

        if (left >= right || right > array.length) return -1;

        int mid = (right + left) / 2;

        if (array[mid] == target) {

            return mid;
        }

        if (array[mid] > target) {
            return recursionBinarySearch(array, left, mid, target);
        }

        if (array[mid] < target) {
            return recursionBinarySearch(array, mid, right, target);
        }
        return -1;

    }
}
