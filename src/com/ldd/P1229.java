package com.ldd;

import java.util.Scanner;
/**
 * Created by Administrator on 2017/12/29.
 * 汽水瓶：
 * 三个空汽水瓶可以换一瓶汽水。例如十个空汽水瓶可以换5瓶汽水。
 * 输入一个整数，代表空汽水瓶数量，输出可以换到的汽水数量。
 */
public class P1229 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            int left = num;
            int total = 0;
            while (left != 0){
                if(left == 2){
                    total++;
                    break;
                }else if(left == 1){
                    break;
                } else {
                    int curr = left / 3;
                    total += curr;
                    left = left - curr*3 + curr;
                }
            }
            System.out.println(total);

        }
    }
}
