package com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/22.
 * 字符串分隔：
 * 连续输入字符串（输入两次，每个字符串长度小于100），请按长度为8拆分每个字符串后输出到新的字符串数组；
 * 长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 *
 */
public class P1222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s1 = sc.next();
            String s2 = sc.next();
            int length1 = s1.length();
            int length2 = s2.length();
            StringBuffer sb = new StringBuffer(s1);
            for (int i = 0; length1%8!=0 && i < (8-length1%8) ; i++) {
                sb.append(0);
            }
            sb.append(s2);
            for (int i = 0; length2%8!=0 && i < (8-length2%8) ; i++) {
                sb.append(0);
            }
            for (int i = 0; i < sb.length(); i++) {
                System.out.print(sb.charAt(i));
                if((i+1)%8==0){
                    System.out.println();
                }
            }
        }
    }
}
