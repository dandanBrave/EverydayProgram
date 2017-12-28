package com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/28.
 * 简单密码：
 * 1--1， abc--2, def--3, ghi--4, jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0,
 * 把密码中出现的小写字母都变成对应的数字，数字和其他的符号都不做变换，
 * 大写字母则变成小写之后往后移一位，如：X，先变成小写，再往后移一位，就是y，z往后移是a。
 */
public class P1228 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.next();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < s.length() ; i++) {
                if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                    sb.append(s.charAt(i));
                }else if(s.charAt(i)>='a' && s.charAt(i)<='c'){
                    sb.append(2);
                }else if(s.charAt(i)>='d' && s.charAt(i)<='f'){
                    sb.append(3);
                }else if(s.charAt(i)>='g' && s.charAt(i)<='i'){
                    sb.append(4);
                }else if(s.charAt(i)>='j' && s.charAt(i)<='l'){
                    sb.append(5);
                }else if(s.charAt(i)>='m' && s.charAt(i)<='o'){
                    sb.append(6);
                }else if(s.charAt(i)>='p' && s.charAt(i)<='s'){
                    sb.append(7);
                }else if(s.charAt(i)>='t' && s.charAt(i)<='v'){
                    sb.append(8);
                } else if(s.charAt(i)>='w' && s.charAt(i)<='z'){
                    sb.append(9);
                }else if(s.charAt(i)>='A' && s.charAt(i)<='Y'){
                    sb.append((char)((int)s.charAt(i)+33));
                }else if(s.charAt(i)=='Z'){
                    sb.append('a');
                }
            }
            System.out.println(sb.toString());
        }
    }
}
