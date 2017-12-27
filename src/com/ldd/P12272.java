package com.ldd;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/27.
 * 简单错误记录：
 * 一行或者多行字符串，每行包括带路径文件名称，行号，以空格隔开。
 * 将所有的记录统计并将结果输出，格式：文件名 代码行数  数目，一个空格隔开
 */
public class P12272 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,Integer> map = new LinkedHashMap<String,Integer>();
        while (sc.hasNext()){
           String s = sc.next();
           int linenum = sc.nextInt();
           String[] names = s.split("\\\\");
           int len = names.length;
           String name = names[len-1];

           if(name.length() > 16) {
               name = name.substring(name.length() - 16);
           }
           String key = name + " " + linenum;
           int value = 1;
           if (map.containsKey(key)){
              map.put(key,map.get(key)+1);
           }else {
               map.put(key,value);
           }
        }
        int count = 0;
        for (String str:map.keySet()) {
            count++;
            if(count>(map.keySet().size()-8)){
                System.out.println(str+" "+map.get(str));
            }
        }
    }
}
