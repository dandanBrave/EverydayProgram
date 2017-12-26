package com.ldd;

import java.util.Scanner;
/**
 * Created by Administrator on 2017/12/26.
 * 数字颠倒：
 *输入一个int整数，将这个整数以字符串的形式逆序输出
 */
public class P12262 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            StringBuffer sb = new StringBuffer();
            sb.append(num);
            System.out.println(sb.reverse().toString());
        }
    }
}
