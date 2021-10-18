package com.daiwf.algorithm.leetcode;

/**
 * @description:
 * @author: daiwf
 * @time: 2021-10-18
 */
public class problem476 {


    /**
     * @作者 daiwf
     * @创建时间 2021-10-18 22:40
     * @功能描述 [这道题主要注意以下几点]
     * 1、java整型的范围是-2^31 至 2^31-1 因为首位是符号位。为了防止溢出求mask的时候30的时候做特殊判断就是求31个1那就是0x7fffffff
     * 求负整数的补码，将其原码除符号位外的所有位取反（0变1，1变0，符号位为1不变）后加1
     * 正数的补码就是他自己
     * 2、1<<i就是2^i的意思，左移运算
     * 3、和1做异或运算就是取反
     * * @param null
     * @return:
     */
    public int findComplement(int num) {
        int highbit=0;
        for(int i=1;i<=30;++i){
            if(num>=(1<<i)){
                highbit=i;
            }
            else {
                break;
            }
        }
        int mask = highbit==30?0x7fffffff:(1<<(highbit+1))-1;
        return  num^mask;

    }

}
