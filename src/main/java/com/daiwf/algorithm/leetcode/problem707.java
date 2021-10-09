package com.daiwf.algorithm.leetcode;

import java.util.List;

/**
 * @version [版本号，2021-10-09]
 * @文件名 problem707
 * @作者 daiwf
 * @创建时间 2021-10-09 12:15
 * @描述 [移除链表元素]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem707 {


    /**
     * @作者 daiwf
     * @创建时间 2021-10-09 12:43
     * @版权 Copyright Epoint Tech. Co. Ltd. All Rights Reserved.
     * @功能描述 [这个是自己想出来的，先遍历后面的，再处理头结点]
     * * @param null
     * @return:
     */
    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        }
        ListNode curr = head;
        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        if (head.val == val) {
            return head.next;
        } else {
            return head;
        }
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
