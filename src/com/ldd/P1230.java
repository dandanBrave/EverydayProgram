package com.ldd;

import java.util.Scanner;
/**
 * Created by Administrator on 2017/12/30.
 * 合唱队：
 * 计算最少出列多少位同学，使得剩下的同学排成合唱队形：
 * N位同学站成一排，音乐老师要请其中的(N-K)位同学出列，使得剩下的K位同学排成合唱队形。
 * 合唱队形是指这样的一种队形：设K位同学从左到右依次编号为1，2…，K，他们的身高分别为T1，T2，…，TK，
 * 则他们的身高满足存在i（1<=i<=K）使得T1<T2<......<Ti-1<Ti>Ti+1>......>TK。
 * 你的任务是，已知所有N位同学的身高，计算最少需要几位同学出列，可以使得剩下的同学排成合唱队形。
 */
public class P1230 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int N = sc.nextInt();
            if(N < 2){
                System.out.println(0);
            }
            int[] student = new int[N];
            int[] left_queue = new int[N];
            int[] right_queue = new int[N];
            for (int i = 0; i < N ; i++) {
                student[i] = sc.nextInt();
                left_queue[i] = 1;
                right_queue[i] = 1;
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < i ; j++) {
                    if(student[i]>student[j] && left_queue[j]+1 > left_queue[i]){
                        left_queue[i] = left_queue[j] + 1;
                    }
                }
            }
            for (int i = N-1; i >= 0 ; i--) {
                for (int j = N-1; j > i ; j--) {
                    if(student[i] > student[j] && right_queue[j]+1 > right_queue[i]){
                        right_queue[i] = right_queue[j] + 1;
                    }
                }
            }
            int max = 0;
            for (int i = 0; i < N ; i++) {
                if(left_queue[i] + right_queue[i] > max){
                    max = left_queue[i] + right_queue[i];
                }
            }
            System.out.println(N - max +1);


        }
    }
}
