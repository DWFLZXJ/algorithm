package com.daiwf.algorithm.leetcode;

/**
 * @version [版本号，2021/10/5 0005]
 * @文件名 problem66
 * @作者 daiwf
 * @创建时间 2021/10/5 0005 20:47
 * @描述 [66题加一]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem66 {
    /**
     * @作者 daiwf
     * @创建时间 2021/10/5 0005 20:47
     * @功能描述 []
     * * @param null
     * @return:
     */
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            ++digits[i];
            if(digits[i]%10!=0){
                return digits;
            }
            digits[i]=0;
        }
        digits = new int[digits.length+1];

        digits[0]=1;
        return digits;


    }
}
