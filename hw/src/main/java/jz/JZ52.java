package jz;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author FuDaoPin
 * @version 1.0.0
 * @ClassName JZ52.java
 * @Description 两个链表的第一个公共结点
 * @createTime 2022年02月25日 14:17:00
 */
public class JZ52 {
    public static void main(String[] args) {
        ListNode node1_1 = new ListNode(4);
        ListNode node1_2 = new ListNode(1);
        node1_1.next=node1_2;
//        ListNode node1_3 = new ListNode(3);

        ListNode node2_3 = new ListNode(5);
        ListNode node2_4 = new ListNode(0);
        ListNode node2_5 = new ListNode(1);
        node2_3.next=node2_4;
        node2_4.next=node2_5;

        ListNode node3_6 = new ListNode(8);
        ListNode node3_7 = new ListNode(4);
        ListNode node3_8 = new ListNode(5);
        node3_6.next=node3_7;
        node3_7.next = node3_8;

        node1_2.next=node3_6;
        node2_5.next=node3_6;


        show(node1_1);
        show(node2_4);

        ListNode resNode = FindFirstCommonNode(node1_1, node2_4);

        show(resNode);

    }


    // 解法1 采用set集合
    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {

        Set<ListNode> nodes = new HashSet<>();

        while (pHead1 != null) {
            nodes.add(pHead1);
            pHead1 = pHead1.next;
        }

        while (pHead2 != null) {
//            pHead2 = pHead2.next;
            if (nodes.contains(pHead2)) {
                return pHead2;
            }
            pHead2 = pHead2.next;
        }
        return null;
    }

    //解法二

    private static void show(ListNode node) {
        if (node == null) {
            System.out.println("{}");
        } else {
            while (node != null) {
                System.out.print(node.val + " ");
                node = node.next;
            }

            System.out.println();
        }
    }

    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}


