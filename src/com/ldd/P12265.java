package com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/26.
 * 字符串的连接最长路径查找：
 * 给定n个字符串，请对n个字符串按照字典序排序。
 */
public class P12265 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            String[] strings = new String[num];
            for (int i = 0; i < num ; i++) {
                strings[i] = sc.next();
            }
            for (int i = 1; i < num; i++) {
                for (int j = 0; j < i; j++) {
                    if(strings[j].compareTo(strings[i]) > 0 ){
                        String s = strings[j];
                        strings[j] = strings[i];
                        strings[i] = s;
                    }
                }
            }
            for (int i = 0; i < num; i++) {
                System.out.println(strings[i]);
            }
        }
    }
}
