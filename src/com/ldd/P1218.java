package com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/18.
 * 字符串最后一个单词的长度
 */
public class P1218 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            int sum = 0;
            int i = s.length() - 1;
            while (s.charAt(i)!=' ' && i>=0){
                sum ++;
                if(i==0){
                    break;
                }
                i--;
            }
            System.out.println(sum);
        }
    }
}