package com.daiwf.algorithm.leetcode;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

/**
 * @version [版本号，2021/10/8 0008]
 * @文件名 problem142
 * @作者 daiwf
 * @创建时间 2021/10/8 0008 19:49
 * @描述 [环形链表]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem142 {

    /**
     * @作者 daiwf
     * @创建时间 2021/10/8 0008 20:34
     * @功能描述 [利用Map自己想到的方法]
     * * @param null
     * @return:
     */
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        ListNode curr = head;
        HashMap<ListNode,Integer> map =new HashMap<>();
        while (curr.next != null) {
            if(map.getOrDefault(curr,0)>0){
                return curr;
            }
            map.put(curr,map.getOrDefault(curr,0)+1);
            curr = curr.next;
        }
        return null;
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
