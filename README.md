# huaweiJO

## 华为外包牛客刷题

### 未通过

- HW68 无法通过（差一个案例）使用list sort 排序 --> 非稳定排序，若是两个相等 ，二者也会造成顺序交换，从而导致与预期的输出不完全一致
- HW41 题目还不能理解
- HW28 太难了 目前还无法找到思绪
- HW25 题目太长了，懒得看

## NC 刷题

### 已完成

#### 简单

- NC17 最长回文子串
```java
package nc;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName NC17.java
 * @Description 最长回文子串
 * @createTime 2022年01月21日 16:48:00
 */
public class NC17 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param A string字符串
     * @return int整型
     */
    public static int getLongestPalindrome(String A) {
        // write code here
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= A.length(); i++) {
            for (int j = i; j <= A.length(); j++) {
                if (isPalindrome(A.substring(i, j))) {
                    max = Math.max(max, j - i);
                }
            }
        }

        return max;
    }

    public static boolean isPalindrome(String s) {
        for (int k = 0; k < s.length() / 2; k++) {
            if (s.charAt(k) != s.charAt(s.length() - k - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(getLongestPalindrome("aaccaa"));
    }
}

```

- NC22 合并两个有序的数组
```java
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

```
- NC61 两数之和
```java

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
```
- NC65 斐波那契数列

```java
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
```

- NC68 跳台阶
```java
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
```

- NC140 排序 
```java 
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

   ```

### 未完成

- NC78 反转链表
