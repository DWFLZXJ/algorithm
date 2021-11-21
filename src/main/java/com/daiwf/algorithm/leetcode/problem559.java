package com.daiwf.algorithm.leetcode;

import org.w3c.dom.Node;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/**
 * @description:
 * @author: daiwf
 * @time: 2021-11-21
 */
public class problem559 {



//广度优先遍历 深度的已经在leecode上写过了。
    public int maxDepth(Node root) {

        Deque<Node> dq = new ArrayDeque<>();
        int ans = 0;
        if (root == null) {
            return 0;
        }
        dq.addLast(root);
        while (!dq.isEmpty()) {
            int size = dq.size();
            while (size > 0) {
                size--;
                Node node = dq.pollFirst();
                for (Node child : node.children) {
                    dq.addLast(child);
                }
            }

            ans++;


        }
        return ans;

    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;

}
