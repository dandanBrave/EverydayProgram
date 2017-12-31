package com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/31.
 * 字符串排序：
 * 规则1：英文字母从A到Z排序，不区分大小写，如Type输出epTy；
 * 规则2：同一个英文字母的大小写同时存在时，按照输入输出顺序排列，如BabA，输出aABb；
 * 规则3：非英文字母的其他字符保持原来的位置,如By?e，输出Be?y。
 */
public class P1231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            char[] arr = s.toCharArray();
            StringBuffer sb = new StringBuffer();

            for (int i = 0; i < 26 ; i++) {
                for (int j = 0; j < arr.length ; j++) {
                    char c = arr[j];
                    if(c-'A' == i || c-'A'-32 == i){
                        sb.append(c);
                    }
                }
            }
            for (int i = 0; i < arr.length ; i++) {
                if(!((arr[i]>='A' && arr[i]<='Z') || (arr[i]>='a' && arr[i]<='z'))){
                    sb.insert(i,arr[i]);
                }
            }
            System.out.println(sb.toString());
        }
    }
}
