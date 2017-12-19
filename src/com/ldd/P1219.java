package com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/19.
 */
public class P1219 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            char c = sc.next().toLowerCase().charAt(0);
            int length = s.length();
            int sum = 0;
            String us = s.toLowerCase();

            for (int i = 0; i < length ; i++) {
                if(us.charAt(i) == c){
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
