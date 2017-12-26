package com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/26.
 * 求int型正整数在内存中存储时1的个数：
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 */
public class P12266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            String bNum = Integer.toBinaryString(num);
            int sum = 0;
            for (int i = 0; i < bNum.length() ; i++) {
                if(bNum.charAt(i) == '1'){
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
