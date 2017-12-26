package com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/26.
 * 字符串反转:
 * 输入一个字符串，输出该字符串反转后的字符串
 */
public class P12263 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.next();
            StringBuffer sb = new StringBuffer(s);
            System.out.println(sb.reverse());
        }
    }
}
