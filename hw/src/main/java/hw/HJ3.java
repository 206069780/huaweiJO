package hw;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author FuDaoPin
 * @version 1.0.0
 * @ClassName HJ3.java
 * @Description 明明的随机数
 * @EMAIL: fudaopin@huawei.com
 * @createTime 2023年02月09日 10:59:00
 */
public class HJ3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Set<Integer> nums = new HashSet<>();
        // 注意 hasNext 和 hasNextLine 的区别
        while (n-->0) { // 注意 while 处理多个 case
            nums.add(in.nextInt());
        }
        nums.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);
    }



}
