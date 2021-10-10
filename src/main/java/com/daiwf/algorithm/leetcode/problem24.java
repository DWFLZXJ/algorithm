package com.daiwf.algorithm.leetcode;

/**
 * @version [版本号，2021-10-10]
 * @文件名 problem24
 * @作者 daiwf
 * @创建时间 2021-10-10 14:29
 * @描述 [两两交换链表中的节点]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem24 {

    /**
     * @作者 daiwf
     * @创建时间 2021-10-10 14:30
     * @功能描述 [利用递归的方式去解]
     * @return:
     */
    public ListNode swapPairs(ListNode head) {
        //首先找到边界，什么时候停止递归、如果链表就一个对象。或者没有了就退出
        if (head == null || head.next == null) {
            return head;
        }
        //一共就三个元素 head,head.next,swapPairs(head.next.next)
        ListNode next = head.next;
        //下面两行只要反过来就会stackoverflow了 注意，两个指针对峙有点死循环的意思
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
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
