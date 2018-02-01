package dogyear.january.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/21.
 */
public class P0121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String s = sc.next();
            char[] cs = s.toCharArray();
            String temp = "-1";
            for (int i = 0; i < s.length(); i++) {
                if(s.indexOf(cs[i]) == s.lastIndexOf(cs[i])){
                    temp = cs[i]+"";
                    break;
                }
            }
            System.out.println(temp);
        }
    }
}
