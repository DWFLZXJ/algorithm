package com.daiwf.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @version [版本号，2021/10/8 0008]
 * @文件名 problem187
 * @作者 daiwf
 * @创建时间 2021/10/8 0008 11:31
 * @描述 [重复的DNA序列]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem187 {
    static final int L = 10;

    /**
     * @作者 daiwf
     * @创建时间 2021/10/8 0008 12:21
     * @功能描述 [用hash表解决]
     * * @param null
     * @return:
     */
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans = new ArrayList<String>();
        Map<String, Integer> cnt = new HashMap<String, Integer>();
        int n = s.length();
        for (int i = 0; i <= n - L; ++i) {
            String sub = s.substring(i, i + L);
            cnt.put(sub, cnt.getOrDefault(sub, 0) + 1);
            if (cnt.get(sub) == 2) {
                ans.add(sub);
            }
        }
        return ans;

    }
}
