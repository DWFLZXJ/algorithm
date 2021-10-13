package com.daiwf.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @version [版本号，2021-10-13]
 * @文件名 problem412
 * @作者 daiwf
 * @创建时间 2021-10-13 8:19
 * @描述 []
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class problem412 {
    /**
     * @作者 daiwf
     * @创建时间 2021-10-13 8:20
     * 写一个程序，输出从 1 到 n 数字的字符串表示。
     * <p>
     * 1. 如果 n 是3的倍数，输出“Fizz”；
     * <p>
     * 2. 如果 n 是5的倍数，输出“Buzz”；
     * <p>
     * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/fizz-buzz
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * * @param null
     * @return:
     */
    public List<String> fizzBuzz(int n) {

        List<String> list = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            StringBuffer sb = new StringBuffer();
            if (i % 3 == 0) {
                sb.append("Fizz");
            }
            if (i % 5 == 0) {
                sb.append("Buzz");
            }
            if (sb.length() > 0) {
                list.add(sb.toString());
            } else {
                list.add(String.valueOf(i));
            }

        }
        return list;

    }
}
