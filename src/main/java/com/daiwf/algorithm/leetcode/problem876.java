package com.daiwf.algorithm.leetcode;

/**
 * @version [版本号，2021-10-11]
 * @文件名 problem876
 * @作者 daiwf
 * @创建时间 2021-10-11 21:50
 * @描述 [链表的中间节点]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem876 {

    /**
     * @作者 daiwf
     * @创建时间 2021-10-12 22:06
     * @功能描述 [这次的双指针是自己想到的，真正的掌握双指针了开心]
     * * @param null
     * @return:
     */
    public ListNode middleNode(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while (fast!=null){
            slow=slow.next;
            if(fast.next!=null&&fast.next.next!=null){
                fast=fast.next.next;
            }
            else {
                return slow;
            }

        }
        return head;

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
