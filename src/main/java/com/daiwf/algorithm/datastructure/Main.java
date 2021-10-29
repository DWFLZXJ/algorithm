package com.daiwf.algorithm.datastructure;

/**
 * @description:
 * @author: daiwf
 * @time: 2021-10-17
 */
public class Main {
    public static void main(String[] args) {
        BST<Integer> bst = new BST();
        int[] nums = new int[]{2, 5, 10, 3, 1, 9, 4};
        for (int num : nums) {
            bst.add(num);
        }

       if( bst.contains(5)){
           System.out.println("有这个元素");
       }

        bst.preOrder();
        System.out.println("++++++++++++++++");
        bst.preOrderNR();
        System.out.println("================");
        bst.inOrder();
        System.out.println(">>>>>>>>>>>>.");
        bst.postOrder();

    }
}
