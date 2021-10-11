package com.daiwf.algorithm.leetcode;


import java.util.List;

/**
 * @version [版本号，2021-10-10]
 * @文件名 problem707
 * @作者 daiwf
 * @创建时间 2021-10-10 21:03
 * @描述 [设计链表]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class MyLinkedList {

    int size;
    ListNode head;

    public MyLinkedList() {
        size = 0;
        head = new ListNode(0);
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode cur = head.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    //这边我一开始认为加到尾部就是size-1的地方就是尾部，其实不对的。和加到头部是不一样的应该是size
    public void addAtTail(int val) {
        addAtIndex(size , val);
    }

    public void addAtIndex(int index, int val) {
        //找到index的节点,注意这边cur取哨兵。我们要找的其实是index的前一个节点的、
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        ListNode toAdd = new ListNode(val);
        ListNode next = cur.next;
        cur.next = toAdd;
        toAdd.next = next;
        size++;
    }

    public void deleteAtIndex(int index) {
        // if the index is invalid, do nothing 这边一开始没有考虑到特殊情况所以没过
        if (index < 0 || index >= size) {
            return;
        }
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        size--;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


}
