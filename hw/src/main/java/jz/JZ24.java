package jz;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author FuDaoPin
 * @version 1.0.0
 * @ClassName JZ24.java
 * @Description reverse linklist
 * @createTime 2022年02月22日 21:57:00
 */
public class JZ24 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
       ListNode res=  reverseListNode(node1);
        while ( res!= null) {
            System.out.print(res);
            res = res.next;
        }

    }

    private static ListNode reverseListNode(ListNode listNode) {
        ListNode pre = null;

        ListNode curr = listNode;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next=pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }


 static class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }

     @Override
     public String toString() {
         return val+" ";
     }
 }
}
