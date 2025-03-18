package practice;

/**
 * 反转链表
 *
 * @author lx
 * @date 2025/3/15 11:03
 */
public class Practice_007_ListReverse {

    // 单链表节点
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    //反转链表
    //反转单链表测试链接 : https://leetcode.cn/problems/reverse-linked-list/
    public static ListNode listReverse(ListNode head) {
        // 1->2->3
        ListNode pre = null;
        ListNode next = null;
        while (head != null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return head;
    }


    // 双链表节点
    public static class DoubleListNode {
        public int value;
        public DoubleListNode last;
        public DoubleListNode next;

        public DoubleListNode(int v) {
            value = v;
        }
    }

    // 反转双链表
    public static DoubleListNode reverseDoubleList(DoubleListNode head) {
        DoubleListNode pre = null;
        DoubleListNode next = null;
        //1-> <- 2 -> <-3
        while (head != null) {
            next = head.next;
            head.next = pre;
            head.last = next;
            pre = head;
            head = next;
        }

        return head;
    }


}
