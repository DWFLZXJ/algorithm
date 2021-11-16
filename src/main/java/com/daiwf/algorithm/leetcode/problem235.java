package com.daiwf.algorithm.leetcode;

/**
 * @description: 二叉搜索树的最近公共祖先
 * @author: daiwf
 * @time: 2021-11-15
 */
public class problem235 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode result = root;
        while (true){
            if(result.val>p.val&&result.val>q.val){
                result=result.left;
            }else if(result.val<p.val&&result.val< q.val){
                result=result.right;
            }else {
                break;
            }

        }
        return result;
    }
    public class TreeNode {
     int val;
     TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
