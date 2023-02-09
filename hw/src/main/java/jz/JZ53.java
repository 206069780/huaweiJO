package jz;

import java.util.HashMap;
import java.util.Map;

/**
 * @author FuDaoPin
 * @version 1.0.0
 * @ClassName JZ53.java
 * @Description 数字在升序数组中出现的次数
 * @createTime 2022年02月25日 15:11:00
 */
public class JZ53 {
    public static void main(String[] args) {
        int [] array = {1,2,3,3,3,3,4,5};
        System.out.println(GetNumberOfK(array,3));

    }

    public static int GetNumberOfK(int[] array, int k) {
        Map<Integer,Integer> resMap = new HashMap<>();
        for (int i : array) {
            if (resMap.containsKey(i)) {
                resMap.put(i,resMap.get(i)+1);
            }
            else {
                resMap.put(i, 1);
            }
        }
        return resMap.get(k) == null ? 0 : resMap.get(k);
    }
}
