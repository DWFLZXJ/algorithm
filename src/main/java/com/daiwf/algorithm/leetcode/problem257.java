package com.daiwf.algorithm.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @description:
 * @author: daiwf
 * @time: 2021-11-11
 */
public class problem257 {


    /**
     * 深度优先遍历做过了 广度来一下 daiwf
     *
     * @param root
     * @return
     */
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> List = new ArrayList();
        if (root == null) {
            return List;
        }
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<String> pathQueue = new LinkedList<>();
        nodeQueue.offer(root);
        pathQueue.offer(String.valueOf(root.val));

        while (!nodeQueue.isEmpty()) {
            String path = pathQueue.poll();
            TreeNode cur = nodeQueue.poll();

            if (cur.left == null && cur.right == null) {
                List.add(path);
            }
            if (cur.left != null) {
                nodeQueue.offer(cur.left);
                pathQueue.offer(new StringBuffer(path).append("->").append(cur.left.val).toString());
            }
            if (cur.right != null) {
                nodeQueue.offer(cur.right);
                pathQueue.offer(new StringBuffer(path).append("->").append(cur.right.val).toString());
            }
        }

        return List;


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
