package dogyear.com.ldd;

import java.util.Scanner;
/**
 * Created by Administrator on 2018/1/6.
 * 不是自己写的
 * 字符串运用-密码截取：
 * 输入一个字符串，返回有效密码串（对称）的最大长度
 */
public class P0106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.next();
            System.out.println(process(s));
        }
    }

    private static int process(String s) {
        int len = s.length();
        if(len < 1)
            return 0;
        int max = 1;
        //考虑奇数个数的回文串
        for (int i = 1; i < len-1 ; i++) {
            int k = i-1,j = i+1;
            int count = 0;
            while (k>=0 && j<=len-1){
                if(s.charAt(k--) == s.charAt(j++)){
                    count++;
                }else{
                    break;
                }
            }
            max = (max>=(count*2+1)) ? max:(count*2+1);
        }
        //偶数个数的回文串
        for (int i = 1; i < len-1 ; i++) {
            int k=i-1,j=i;
            int count = 0;
            while (k>=0 && j<=len-1){
                if(s.charAt(k--) == s.charAt(j++)){
                    count++;
                }else {
                    break;
                }
            }
            max = (max>=count*2) ? max:(count*2);
        }
        return max;
    }
}

