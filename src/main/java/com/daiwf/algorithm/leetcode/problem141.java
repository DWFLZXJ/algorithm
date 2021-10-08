package com.daiwf.algorithm.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @version [版本号，2021/10/8 0008]
 * @文件名 problem141
 * @作者 daiwf
 * @创建时间 2021/10/8 0008 12:27
 * @描述 [环形链表]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem141 {

    /**
     * @作者 daiwf
     * @创建时间 2021/10/8 0008 12:39
     * @功能描述 [直接用hashset判]
     * * @param null
     * @return:
     */
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode current = head;
        while (current != null) {
            if (!set.add(current)) {
                return true;
            }
            current = current.next;
        }
        return false;

    }


    /**
     * @作者 daiwf
     * @创建时间 2021/10/8 0008 12:42
     * @功能描述 [采用快慢指针]
     * * @param null
     * @return:
     */
    public boolean hasCycle1(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != slow) {
            if(fast==null||fast.next==null){
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return true;

    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

}
