package com.daiwf.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @description:最大单词长度乘积
 * @author: daiwf
 * @time: 2021-11-17
 */
public class problem318 {
    public int maxProduct(String[] words) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int wordslen = words.length;
        for (int i = 0; i < wordslen; i++) {
            int mask = 0;
            String word = words[i];
            int wordlength = word.length();
            for (int j = 0; j < wordlength; j++) {
                mask |= 1 << (word.charAt(j) - 'a');
            }
            if (wordlength > map.getOrDefault(mask, 0)) {
                map.put(mask, wordlength);
            }
        }

        Set<Integer> keysets = map.keySet();
        int maxPro = 0;
        for (int key : keysets) {
            int length1 = map.get(key);
            for (int key1 : keysets) {

                if ((key & key1) == 0) {
                    int length2 = map.get(key1);
                    maxPro = Math.max(maxPro, length1 * length2);
                }
            }
        }
        return maxPro;
    }

}
