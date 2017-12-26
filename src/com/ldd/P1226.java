package com.ldd;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/**
 * Created by Administrator on 2017/12/26.
 * 字符个数统计：
 * 输入N个字符，字符在ACSII码范围内，输出范围在（0-127）不同字符的个数
 */
public class P1226 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            Set<Character> set = new HashSet<Character>();
            for (int i = 0; i < s.length(); i++) {
                set.add(s.charAt(i));
            }
            System.out.println(set.size());
        }
    }
}
