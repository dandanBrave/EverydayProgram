package com.ldd;

import java.util.Scanner;
/**
 * Created by Administrator on 2017/12/29.
 * 删除字符串中出现次数最少的字符：
 * 输入字符串只包含小写英文字母，若多个字符出现次数一样，则都删除，输出删除字符串中出现次数最少的字符后的字符串
 */
public class P12292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.next();
            int[] letter = new int[26];
            for (int i = 0; i < s.length() ; i++) {
                letter[s.charAt(i)-'a']++;
            }
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < 26; i++) {
                if(letter[i] != 0 && letter[i] < min){
                    min = letter[i];
                }
            }
            for (int i = 0; i < s.length(); i++) {
                if(letter[s.charAt(i)-'a'] != min){
                    System.out.print(s.charAt(i));
                }
            }
            System.out.println();
        }
    }
}
