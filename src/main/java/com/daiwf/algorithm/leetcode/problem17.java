package com.daiwf.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: daiwf
 * @time: 2021-11-21
 */
public class problem17 {
  private static   Map<Character, String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {

        List<String> combinations = new ArrayList<>();
        if (digits.length() == 0) {
            return combinations;
        }
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        StringBuffer combination = new StringBuffer();
        backtrack(combinations, digits, 0, combination);
        return combinations;

    }

    //回溯函数
    public void backtrack(List<String> combinations, String digits, int index, StringBuffer combination) {
        if (index == digits.length()) {
            combinations.add(combination.toString());
            return;
        }

       Character digit = digits.charAt(index);
       String str=  map.get(digit);
       for (int i=0;i<str.length();i++){
           combination.append(str.charAt(i));
           backtrack(combinations,digits,index+1,combination);
           combination.deleteCharAt(index);
       }
    }

}
