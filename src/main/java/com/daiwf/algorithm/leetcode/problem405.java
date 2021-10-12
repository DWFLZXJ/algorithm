package com.daiwf.algorithm.leetcode;

/**
 * @version [版本号，2021-10-11]
 * @文件名 problem405
 * @作者 daiwf
 * @创建时间 2021-10-11 22:04
 * @描述 [数字转换为16进制数]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem405 {

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 7; i >= 0; i--) {
            int val = num >> (4 * i) & 0xf;
            if (sb.length() > 0 || val > 0) {
                sb.append(val < 10 ? (char) ('0' + val) : (char) ('a' + val - 10));
            }
        }
        return sb.toString();
    }

}
