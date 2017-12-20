package com.ldd;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/20.
 * 明明的随机数：用计算机生成了N个1到1000之间的随机整数（N≤1000），
 * 对于其中重复的数字，只保留一个，把其余相同的数去掉，然后再把这些数从小到大排序。
 * 请你协助明明完成“去重”与“排序”的工作。
 */
public class P1220 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            int[] array = new int[num];
            for (int i = 0; i < num ; i++) {
                array[i] = sc.nextInt();
            }
            Arrays.sort(array);
            int index = array[0];
            System.out.println(index);
            for (int i = 1; i < num; ) {
                if(index == array[i]){
                    i++;
                }else {
                    index = array[i];
                    i++;
                    System.out.println(index);
                }
            }
        }
    }
}
