package com.ldd;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Administrator on 2017/12/24.
 * 合并表记录：
 * 数据表记录包含表索引和数值，请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
 */
public class P12242 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            Map<Integer,Integer> map = new TreeMap<Integer,Integer>();
            for (int i = 0; i < num ; i++) {
                int key = sc.nextInt();
                int value = sc.nextInt();
                if(map.containsKey(key)){
                    map.put(key,map.get(key)+value);
                }else{
                    map.put(key,value);
                }
            }
            for (Integer key: map.keySet()) {
                System.out.println(key + " " + map.get(key));
            }
        }
    }
}
