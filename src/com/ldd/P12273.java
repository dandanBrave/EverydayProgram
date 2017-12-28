package com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/12/27.
 * 密码验证合格程序：
 * 长度超过8位；包括大小写字母、数字、其他符号以上四种至少三种；不能有相同长度超过2的子串重复
 * 输入：一组或多组长度超过2的字符串。每组占一行
 * 输出：如果符合要求输出OK，否则输出NG
 */
public class P12273 {
    public static boolean checkLength(String s) {
        int len = s.length();
        //就这块判断长度出错，超过8.....
        if(s == null || len <= 8){
            return false;
        }
        return true;
    }

    public static boolean checkCharKinds(String s) {
        int digit = 0, lowercase = 0, uppercase = 0, others = 0;
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            if(chars[i]>='0' && chars[i]<='9'){
                digit=1;
                continue;
            }else if(chars[i]>='a' && chars[i]<='z'){
                lowercase=1;
                continue;
            }else if(chars[i]>='A' && chars[i]<='Z'){
                uppercase=1;
                continue;
            }else {
                others=1;
                continue;
            }
        }
        int total = digit+lowercase+uppercase+others;
        return total>=3 ? true : false;
    }

    public static boolean checkCharRepeat(String s) {
        for (int i = 0; i < s.length()-2; i++) {
            String subStr = s.substring(i,i+3);
            if(s.substring(i+1).contains(subStr)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String s = sc.nextLine();
            if(checkLength(s)&&checkCharKinds(s)&&checkCharRepeat(s)){
                System.out.println("OK");
            }else{
                System.out.println("NG");
            }
        }
    }
}
