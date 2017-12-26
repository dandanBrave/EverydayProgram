package com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/26.
 * 句子逆序：
 * 将一个英文语句以单词为单位逆序排放，输出得到逆序的句子。
 */
public class P12264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            String[] sArray = s.split(" ");
            for (int i = sArray.length-1; i >0 ; i--) {
                System.out.print(sArray[i]+" ");
            }
            System.out.println(sArray[0]);
        }
    }
}
