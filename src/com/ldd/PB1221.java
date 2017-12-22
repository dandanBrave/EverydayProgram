package com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/22.
 * 进制转换：
 * 输入一个十六进制的数值字符串，输出该数值的十进制字符串
 */
public class PB1221 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.next();
            int a = Integer.valueOf(s.substring(2),16);
            System.out.println(a);
        }
    }
}
