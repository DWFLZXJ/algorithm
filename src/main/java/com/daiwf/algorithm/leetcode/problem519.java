package com.daiwf.algorithm.leetcode;

import java.util.HashMap;
import java.util.Random;

/**
 * @description:
 * @author: daiwf
 * @time: 2021-11-27
 */
public class problem519 {

    int m, n, total;
    Random random = new Random();
    HashMap<Integer, Integer> map = new HashMap<>();

    public void Solution(int m, int n) {
        this.m = m;
        this.n = n;
        this.total = m * n;
    }

    public int[] flip() {
        int rand = random.nextInt(total);
        total--;
        int idx = map.getOrDefault(rand, rand);
        map.put(rand, map.getOrDefault(total, total));
        return new int[]{idx / n, idx % n};
    }

    public void reset() {
        total=m*n;
        map.clear();
    }
}
