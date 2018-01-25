package dogyear.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/25.
 * 在字符串中找出连续最长的数字串：
 * 输出字符串中最长的数字字符串和它的长度。如果有相同长度的串，则要一块儿输出，但是长度还是一串的长度
 * 样例输出
 * 输出123058789，函数返回值9
 * 输出54761，函数返回值5
 */
public class P01252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.next();
            int len = s.length();
            if(len==0){
                System.out.println(" ,0");
            }
            int result = Integer.MIN_VALUE;
            int sum = 0;
            String resDig = "";
            String dig = "";
            char[] chars = s.toCharArray();
            for (int i = 0; i < len ; i++) {
                if(chars[i]>='0' && chars[i]<='9'){
                     sum++;
                     dig += chars[i];
                     if(sum > result){
                         result = sum;
                     }
                     if(dig.length() > resDig.length()){
                         resDig = dig;
                     }
                }else{
                    sum = 0;
                    dig = "";
                }
            }
            if(dig.length()==resDig.length() && dig!=resDig){
                System.out.println(resDig+dig+","+result);
            }else {
                System.out.println(resDig+","+result);
            }
        }
    }
}