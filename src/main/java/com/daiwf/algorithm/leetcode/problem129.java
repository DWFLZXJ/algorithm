package com.daiwf.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: daiwf
 * @time: 2021-11-11
 */
public class problem129 {
    List<Integer> res = new ArrayList<>();
    public int sumNumbers(TreeNode root) {
          int result=0;
          String tmp="";

         if(root==null){
             return 0;
         }
         calcsum(root,tmp);

         for (int i:res){
             result+=i;
         }
         return result;
    }

    private void calcsum(TreeNode cur,String tmp){

        if(cur==null){
            return;
        }
        tmp=tmp+cur.val;
        if(cur.left==null&&cur.right==null){
            res.add(Integer.valueOf(tmp));
        }
        if(cur.left!=null){
            calcsum(cur.left,tmp);
        }
        if(cur.right!=null){
            calcsum(cur.right,tmp);
        }

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
