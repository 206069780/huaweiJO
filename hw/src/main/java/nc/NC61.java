package nc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName NC61.java
 * @Description 两数之和
 * @createTime 2022年01月21日 14:51:00
 */
public class NC61 {

    public static int[] twoSum(int[] numbers, int target) {
        // write code here
        Map<Integer, Integer> tmp = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (tmp.containsKey(target - numbers[i])) {
                return new int[]{tmp.get(target - numbers[i]), i + 1};
            } else {
                tmp.put(numbers[i], i + 1);
            }
        }

        return new int[2];

    }

    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int[] res = twoSum(arr, 6);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
