package com.daiwf.algorithm.leetcode;

import javax.swing.tree.TreeNode;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @version [版本号，2021-10-17]
 * @文件名 problem230
 * @作者 daiwf
 * @创建时间 2021-10-17 19:40
 * @描述 []
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem230 {

    public int kthSmallest(TreeNode root, int k) {


     Deque<Integer> deque = new LinkedList<>();
        inOder(root,deque);
        for (int i=0;i<k-1;i++){
            deque.pop();
        }
        return deque.peek();
    }

    private void inOder(TreeNode cur, Deque<Integer> deque){
        if (cur==null){
            return;
        }
        inOder(cur.left,deque);
        deque.offer(cur.val);
        inOder(cur.right,deque);
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


}
