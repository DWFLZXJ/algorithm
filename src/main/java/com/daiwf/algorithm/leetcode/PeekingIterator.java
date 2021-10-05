package com.daiwf.algorithm.leetcode;

import java.util.Iterator;

/**
 * @version [版本号，2021/10/5 0005]
 * @文件名 problem284
 * @作者 daiwf
 * @创建时间 2021/10/5 0005 21:11
 * @描述 [这道题的难点其实在题目描述，一下子不知道要干啥]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class PeekingIterator  implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer nextElement;

    public PeekingIterator(Iterator<Integer> iterator) {
        this.iterator = iterator;
        nextElement = iterator.next();
    }

    public Integer peek() {
        return nextElement;
    }

    @Override
    public Integer next() {
        Integer ret = nextElement;
        nextElement = iterator.hasNext() ? iterator.next() : null;
        return ret;
    }

    @Override
    public boolean hasNext() {
        return nextElement != null;
    }
}

