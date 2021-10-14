package com.daiwf.algorithm.leetcode;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @version [版本号，2021-10-14]
 * @文件名 problem20
 * @作者 daiwf
 * @创建时间 2021-10-14 21:25
 * @描述 []
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem20 {

    public boolean isValid(String s) {

        int n = s.length();
        if (n % 2 != 0 || n < 2) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put(']', '[');
        map.put('}', '{');
        map.put(')', '(');
        Deque<Character> stack = new LinkedList();
        for (int i = 0; i < n; i++) {
            char tmp = s.charAt(i);
            if (tmp == '[' || tmp == '{' || tmp == '(') {
                stack.push(tmp);
            } else {
                if (map.get(tmp).equals(stack.peek())) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

}
