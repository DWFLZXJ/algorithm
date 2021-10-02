package com.daiwf.algorithm.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @version [版本号，2021/10/2 0002]
 * @文件名 Intersect
 * @作者 daiwf
 * @创建时间 2021/10/2 0002 8:27
 * @描述 [ 参考题解：https://leetcode-cn.com/problems/intersection-of-two-arrays-ii/solution/liang-ge-shu-zu-de-jiao-ji-ii-by-leetcode-solution/]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem350 {

    /**
     * @作者 daiwf
     * @创建时间 2021/10/2 0002 9:34
     * @功能描述 [利用hashmap实现]
     * * @param null
     * @return:
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0);
            map.put(num, ++count);
        }
        int[] sections = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                sections[index++] = num;
                map.put(num, --count);
            } else {
                //省的下次循环到他，降低了效率
                map.remove(num);
            }
        }
        return Arrays.copyOfRange(sections, 0, index);
    }

    /**
     * @作者 daiwf
     * @创建时间 2021/10/2 0002 9:37
     * @功能描述 [双指针做法]
     * * @param null
     * @return:
     */
    public int[] intersectdoublePointer(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
       int length = Math.min(nums1.length,nums2.length);
       int length1=nums1.length;
       int length2=nums2.length;
       int[] sections = new  int[length];
       int index1=0,index2=0,index=0;
       while (index1<length1&&index2<length2){
           if(nums1[index1]<nums2[index2]){
               index1++;
           }
           else if(nums1[index1]>nums2[index2]){
               index2++;
           }else {
               sections[index++]=nums1[index1];
               index1++;
               index2++;
           }

       }
       return Arrays.copyOfRange(sections,0,index);
    }




}
