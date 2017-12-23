package com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/23.
 * 质数因子
 * 输入一个long型整数，按照从小到大的顺序输出它的所有质数的因子，以空格分开。
 */
public class P1223 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            long a = sc.nextLong();
            int i = 2;
            while (a /i != 1 ){
                if (a % i == 0){
                    System.out.print(i + " ");
                    a = a / i;
                }else {
                    i++;
                }
            }
            System.out.print(a + " ");

        }
    }
}
