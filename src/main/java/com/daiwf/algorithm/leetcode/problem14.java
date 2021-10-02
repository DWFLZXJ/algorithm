package com.daiwf.algorithm.leetcode;

/**
 * @version [版本号，2021/10/2 0002]
 * @文件名 problem14
 * @作者 daiwf
 * @创建时间 2021/10/2 0002 15:23
 * @描述 [https://leetcode-cn.com/problems/longest-common-prefix/]
 * 最长公共前缀
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem14 {

    /**
     * @作者 daiwf
     * @创建时间 2021/10/2 0002 15:48
     * @功能描述 [横向扫描法]
     * * @param null
     * @return:
     */
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            prefix = getLCP(prefix, strs[i]);
            if (prefix.length() == 0) {
                break;
            }
        }
        return prefix;
    }

    public String getLCP(String str1, String str2) {
        int length = Math.min(str1.length(), str2.length());
        int index = 0;

        while (index < length && (str1.charAt(index) == str2.charAt(index))) {
            index++;
        }
        return str1.substring(0, index);
    }


    /**
     * @作者 daiwf
     * @创建时间 2021/10/2 0002 15:49
     * @功能描述 [纵向扫描法]
     * * @param null
     * @return:
     */
    public String longestCommonPrefix1(String[] strs) {

        if (strs.length == 0 || strs == null) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                //这边一开始漏掉了全部匹配的情况。
                if (i == strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }

        }
        return strs[0];
    }


    /**
     * @作者 daiwf
     * @创建时间 2021/10/2 0002 20:13
     * @功能描述 [利用分治的方法]
     * * @param null
     * @return:
     */
    public String longestCommonPrefix2(String[] strs) {

        if (strs.length == 0 || strs == null) {
            return "";
        }
      return   longestCommonPrefix3(strs, 0, strs.length - 1);
    }

    public String longestCommonPrefix3(String[] strs, int start, int end) {

        if (start == end) {
            return strs[start];
        }
        int mid = (end - start) / 2 +start;
        String left = longestCommonPrefix3(strs, start, mid);
        String right = longestCommonPrefix3(strs, mid + 1, end);
        return commonprefix(left, right);
    }


    /**
     * @作者 daiwf
     * @创建时间 2021/10/2 0002 20:31
     * @功能描述 [求两个字符串的公共前缀]
     * * @param null
     * @return:
     */
    public String commonprefix(String str1, String str2) {
        int length = str1.length();
        for (int i = 0; i < length; i++) {
            if (i == str2.length() || str1.charAt(i) != str2.charAt(i)) {
                return str1.substring(0, i);
            }
        }
        return str1;
    }

}
