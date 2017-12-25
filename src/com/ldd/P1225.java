package com.ldd;

import java.util.*;

/**
 * Created by Administrator on 2017/12/25.
 * 提取不重复的整数：
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 */
public class P1225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            //几个set的比较：
            //HashSet:哈希表是通过使用称为散列法的机制来存储信息的，元素并没有以某种特定顺序来存放；
            //LinkedHashSet:以元素插入的顺序来维护集合的连接表，允许以插入的顺序在集合中迭代；
            //TreeSet:提供一个使用树结构存储Set接口的实现，对象以升序顺序存储，访问和遍历的时间很快。
            Set<Integer> set = new LinkedHashSet<Integer>();
            while (num != 0){
                int re = num % 10;
                set.add(re);
                num = num / 10;
            }

            Iterator it = set.iterator();
            while (it.hasNext()){
                Object value = it.next();
                System.out.print(value);
            }
        }
    }
}
