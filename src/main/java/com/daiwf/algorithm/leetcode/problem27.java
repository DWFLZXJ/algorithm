package com.daiwf.algorithm.leetcode;

/**
 * @version [版本号，2021/10/4 0004]
 * @文件名 problem27
 * @作者 daiwf
 * @创建时间 2021/10/4 0004 21:16
 * @描述 [27. 移除元素]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem27 {

    
    /**
     * @作者 daiwf
     * @创建时间 2021/10/4 0004 22:50
     * @功能描述 [费尽心机想出来的解法。双指针，看了题解感觉自己就是个智障。。不过好歹也做出来了]
     * * @param null
     * @return:
     */
    public int removeElement(int[] nums, int val) {

        int length = nums.length;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] == val) {
                int j = i;
                while (j < length && nums[j] == val) {
                    j++;
                }
                if (j < length) {
                    int temp=nums[j];
                    nums[i] = temp;
                    nums[j] = val;
                }
            }
        }

        for(int i = 0; i < length; i++) {
            if (nums[i] == val) {
                count++;
            }
        }
        return length-count;
    }


    /**
     * @作者 daiwf
     * @创建时间 2021/10/4 0004 22:54
     * @功能描述 [官方双指针。]
     * * @param null
     * @return:
     */
    public int removeElement1(int[] nums, int val) {

        int length=nums.length;
        int left=0;
        for(int right=0;right<length;right++){
            if(nums[right]!=val){
                nums[left++]=nums[right];
            }
        }
        return left;
    }

}
