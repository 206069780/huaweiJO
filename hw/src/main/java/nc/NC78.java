package nc;

import java.util.*;

/**
 * @author lc
 * @version 1.0.0
 * @ClassName NC78.java
 * @Description 反转链表
 * @createTime 2022年01月21日 15:32:00
 */
public class NC78 {


    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);
        listNode1.next.next = new ListNode(3);
        reverseList(listNode1);
        while (listNode1 != null) {
            System.out.print(listNode1.val + " ");
            listNode1 = listNode1.next;
        }
    }

    public static ListNode reverseList(ListNode head) {

        Stack<ListNode> stack = new Stack<>();
        //把链表节点全部摘掉放到栈中
        while (head != null) {
            stack.push(head);
            head = head.next;
        }
        if (stack.isEmpty())
            return null;
        ListNode node = stack.pop();
        ListNode dummy = node;
        //栈中的结点全部出栈，然后重新连成一个新的链表
        while (!stack.isEmpty()) {
            ListNode tempNode = stack.pop();
            node.next = tempNode;
            node = node.next;
        }
        //最后一个结点就是反转前的头结点，一定要让他的next
        //等于空，否则会构成环
        node.next = null;
        return dummy;

    }
}


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
