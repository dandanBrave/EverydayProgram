package dogyear.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/1/13.
 * 多线程：
 * 输入一个int整数，输出多个ABCD，
 */
public class P0113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < n ; i++) {
                sb.append("ABCD");
            }
            System.out.println(sb.toString());
        }
    }

}
