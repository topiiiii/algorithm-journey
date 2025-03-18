package practice;

/**
 * 合并两个有序链表
 *
 * @author lx
 * @date 2025/3/15 17:12
 */
public class Practice_008_MergeTwoLists {

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

    // 测试链接 : https://leetcode.cn/problems/merge-two-sorted-lists/
    public static ListNode mergeTwoList(ListNode head1, ListNode head2) {
        if (head1 == null || head2 == null) {
            return head1 == null ? head2 : head1;
        }

        ListNode head = head1.val >= head2.val ? head2 : head1;
        ListNode cur1 = head.next;
        ListNode cur2 = head1.val >= head2.val ? head1 : head2;
        ListNode pre = head;

        while (cur2 != null && cur1 != null) {
            if (cur1.val <= cur2.val) {
                pre.next = cur1;
                cur1 = cur1.next;
            } else {
                pre.next = cur2;
                cur2 = cur2.next;
            }
            pre = pre.next;
        }
        pre.next = cur1 != null ? cur1 : cur2;
        return head;

    }


}
