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

    /**
     * @作者 daiwf
     * @创建时间 2021/10/7 0007 20:07
     * @功能描述 [https://leetcode-cn.com/problems/reverse-linked-list/solution/shi-pin-jiang-jie-die-dai-he-di-gui-hen-hswxy/]
     * 迭代方式进行反转链表，非常重要的 
     * * @param null
     * @return:
     */
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

/**
 * @作者 daiwf
 * @创建时间 2021/10/7 0007 20:28
 * @功能描述 [递归方式实现]
 * * @param null
 * @return:
 */
    public ListNode reverseList1(ListNode head) {

        if(head==null||head.next==null){
            return head;
        }

        ListNode P = reverseList1(head.next);
        head.next.next=head;
        head.next=null;
        return  P;
      
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
