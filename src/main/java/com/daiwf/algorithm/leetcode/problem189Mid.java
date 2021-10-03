package com.daiwf.algorithm.leetcode;

/**
 * @version [版本号，2021/10/3 0003]
 * @文件名 problem189Mid
 * @作者 daiwf
 * @创建时间 2021/10/3 0003 22:24
 * @版权 Copyright Epoint Tech. Co. Ltd. All Rights Reserved.
 * @描述 [旋转数组 中级难度]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem189Mid {
    
    
   /**
    * @作者 daiwf
    * @创建时间 2021/10/3 0003 22:45
    * @版权 Copyright Epoint Tech. Co. Ltd. All Rights Reserved.
    * @功能描述 [这边主要还是看题解，不然很难想到这个解法]
    * * @param null
    * @return:
    */
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%nums.length;
        reverte(nums,0,n-1);
        reverte(nums,0,k-1);
        reverte(nums,k,n-1);
    }

    public void reverte(int[] nums,int start,int end){
        int temp;
        while (start<end){
            temp= nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }


    public void rotate1(int[] nums, int k) {
        int n=nums.length;
        int[] newArrays=new int[n];
        for(int i=0;i<n;i++){
            newArrays[(k+i)%n]=nums[i];
        }
       System.arraycopy(newArrays,0,nums,0,n);
    }



}
