package com.daiwf.algorithm.leetcode;

import java.util.List;

/**
 * @version [版本号，2021/10/7 0007]
 * @文件名 problem206
 * @作者 daiwf
 * @创建时间 2021/10/7 0007 19:22
 * @描述 [反转链表]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem206 {

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
