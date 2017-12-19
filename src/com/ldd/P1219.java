package com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/19.
 * 计算字符个数:写出一个程序，接受一个有字母和数字以及空格组成的字符串，和一个字符，然后
 * 输出输入字符串中含有该字符的个数。不区分大小写
 */
public class P1219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            char c = sc.next().toLowerCase().charAt(0);
            int length = s.length();
            int sum = 0;
            String us = s.toLowerCase();

            for (int i = 0; i < length ; i++) {
                if(us.charAt(i) == c){
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
