package com.daiwf.algorithm.datastructure;

import javafx.beans.property.SimpleIntegerProperty;
import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @description:
 * @author: daiwf
 * @time: 2021-10-29
 */
public class BST<E extends Comparable<E>> {

    private Node root;
    private int size;

    private class Node {
        public E e;
        //相当于两个指向左右子树的指针
        public Node right, left;

        public Node(E e) {
            this.e = e;
            this.left = null;
            this.right = null;
        }
    }

    public BST() {
        size = 0;
        this.root = null;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 向二分搜索树中添加新的元素
     */
    public void add(E e) {
        root = add(root, e);
    }

    public Node add(Node node, E e) {
        if (node == null) {
            size++;
            return new Node(e);
        }
        if (e.compareTo(node.e) < 0) {
            node.left = add(node.left, e);
        }
        if (e.compareTo(node.e) > 0) {
            node.right = add(node.right, e);
        }
        return node;
    }


    /**
     * 判断二分搜索树中是否有元素
     */
    public boolean contains(E e) {
        return contains(root, e);
    }


    public boolean contains(Node node, E e) {
        if (node == null) {
            return false;
        }
        if (e.compareTo(node.e) == 0) {
            return true;
        }
        if (e.compareTo(node.e) < 0) {
            return contains(node.left, e);
        }
        if (e.compareTo(node.e) > 0) {
            return contains(node.right, e);
        }
        return false;

    }

    /**
     * 二分搜索树的前序遍历
     */
    public void preOrder() {
        preOrder(root);
    }

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.e);
        preOrder(node.left);
        preOrder(node.right);

    }

    /**
     * 二分搜索树的中序遍历,中序遍历的结果一般就是排序的结果
     */
    public void inOrder() {
        inOrder(root);
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.e);
        inOrder(node.right);


    }

    /**
     * 二分搜索树的后序遍历
     */
    public void postOrder() {
        postOrder(root);

    }

    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.e);

    }

    /**
     * 非递归的前序遍历
     */
    public void preOrderNR() {
        Stack<Node> stack = new Stack();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.println(node.e);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    /**
     * 二分搜索树的层序遍历
     * 层序遍历使用了队列这个结构
     * 需要细细体会中间的巧妙
     */
    public void levelOrder() {
        Queue<Node> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            Node cur = queue.remove();
            System.out.println(cur.e);
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }

    }

    /**
     * 寻找二分搜索树的最小值
     */
    public E minimum() {
        if (size == 0)
            throw new IllegalArgumentException();
        return minimum(root);

    }

    private E minimum(Node node) {
        if (node.left == null) {
            return node.e;
        }
        return minimum(node.left);
    }

    /**
     * 寻找二分搜索树中的最大值
     */
    public E maximum() {
        if (size == 0)
            throw new IllegalArgumentException();
        return maximum(root);
    }

    private E maximum(Node node) {
        if (node.right == null) {
            return node.e;
        }
        return maximum(node.right);
    }

    /**
     * 删除二分搜索树的最小值
     */
    public E removeMin() {
        E ret = minimum();
        root = removeMin(root);
        return ret;
    }

    private Node removeMin(Node node) {
        if (node.left == null) {
            Node rightNode = node.right;
            node.right = null;
            size--;
           return rightNode;
        }
         node.left= removeMin(node.left);
        return node;
    }


    /**
     * 删除二分搜索树的最大值
     */
    public E removeMax(){
        E ret=maximum();
       root= removeMax(root);
        return ret;
    }

    private Node removeMax(Node node){
        if(node.right==null){
            Node leftNode=node.left;
            node.left=null;
            size--;
            return leftNode;
        }
        node.right=removeMax(node.right);
        return node;
    }

}
