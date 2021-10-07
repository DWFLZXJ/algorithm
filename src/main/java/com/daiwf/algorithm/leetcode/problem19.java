package com.daiwf.algorithm.leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @version [版本号，2021/10/7 0007]
 * @文件名 problem19
 * @作者 daiwf
 * @创建时间 2021/10/7 0007 16:11
 * @描述 [除链表的倒数第 N 个结点,206，141，21，19，876]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */

public class problem19 {

    /**
     * @作者 daiwf
     * @创建时间 2021/10/7 0007 20:53
     * @功能描述 [先来个快慢指针吧]
     * * @param null
     * @return:
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummynode = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummynode;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummynode.next;

    }

/**
 * @作者 daiwf
 * @创建时间 2021/10/7 0007 20:58
 * @功能描述 [这个用栈实现]
 * * @param null
 * @return:
 */
    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode dummynode = new ListNode(0, head);
        Deque<ListNode> stack = new LinkedList<>();
        ListNode curr=dummynode;
        while (curr!=null){
            stack.push(curr);
            curr=curr.next;
        }
        for (int i=0;i<n;i++){
            stack.pop();
        }
        ListNode delnode = stack.peek();
        delnode.next=delnode.next.next;
        ListNode ans = dummynode.next;
        return ans;
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
