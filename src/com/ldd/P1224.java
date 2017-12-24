package com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/24.
 * 取近似值：
 * 输入一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5，向上，否则向下
 */
public class P1224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            float a = sc.nextFloat();
            System.out.println(Math.round(a));
        }
    }
}
