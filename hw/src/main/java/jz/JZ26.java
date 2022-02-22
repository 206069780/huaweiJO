package jz;

import java.util.List;
import java.util.Stack;

/**
 * @author FuDaoPin
 * @version 1.0.0
 * @ClassName JZ26.java
 * @Description 从尾到头打印链表
 * @createTime 2022年02月22日 19:58:00
 */
public class JZ26 {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        List<Integer> list = printListFromTailToHead(node1);

        list.forEach(System.out::println);

    }

    public static Stack<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> list = new Stack<>();
        ListNode tmp = listNode;
        while(tmp!=null){
            list.add(0,tmp.val);
            tmp = tmp.next;
        }
        return list;
    }



    static class ListNode{

        int val;

        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
