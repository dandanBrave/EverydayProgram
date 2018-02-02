package dogyear.february.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/2/2.
 * 查找两个字符串a,b中的最长公共子串
 */
public class P0202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String string1 = sc.next();
            String string2 = sc.next();
            String min = string1.length() > string2.length() ? string2 : string1;
            String max = string1.length() > string2.length() ? string1 : string2;
            int len = 0;
            String res = null;
            for (int i = 0; i < min.length(); i++) {
                for (int j = i + len; j < min.length(); j++) {
                    if (max.contains(min.substring(i, j + 1))) {
                        len = j - i + 1;
                        res = min.substring(i, j + 1);
                    } else {
                        break;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
