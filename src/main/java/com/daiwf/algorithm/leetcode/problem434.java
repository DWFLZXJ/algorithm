package com.daiwf.algorithm.leetcode;

import java.util.Set;
import java.util.TreeSet;

/**
 * @version [版本号，2021/10/7 0007]
 * @文件名 problem434
 * @作者 daiwf
 * @创建时间 2021/10/7 0007 15:52
 * @描述 [字符串中的单词数]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem434 {

    /**
     * @作者 daiwf
     * @创建时间 2021/10/7 0007 15:53
     * @功能描述 [用split不行不知道是什么情况]
     * * @param null
     * @return:
     */
    public int countSegments(String s) {

        int segmentcount=0;
        for (int i=0;i<s.length();i++){
            if((i==0||s.charAt(i-1)==' ')&&s.charAt(i)!=' '){
                segmentcount++;
            }
        }
        return segmentcount;

    }
}
