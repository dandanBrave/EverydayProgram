package com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/26.
 * 坐标移动：
 * A表示向左移动，D向右移动，W向上移动，S向下移动，
 * 合法坐标为A（/D/S/W）+ 数字（两位以内），坐标以；分割
 * 最终输出坐标为以,分隔的坐标
 */
public class P12268 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.nextLine();
            String[] strings = s.split(";");
            int left = 0,right = 0;
            for (int i = 0; i <strings.length ; i++) {
                try {
                    int move = Integer.parseInt(strings[i].substring(1,strings[i].length()));
                    if(strings[i].charAt(0) == 'A'){
                        left -= move;
                    }
                    if(strings[i].charAt(0) == 'D'){
                        left += move;
                    }
                    if(strings[i].charAt(0) == 'W'){
                        right += move;
                    }
                    if(strings[i].charAt(0) == 'S'){
                        right -= move;
                    }
                }catch (Exception e){
                    continue;
                }
            }
            System.out.println(left+","+right);

        }
    }
}
