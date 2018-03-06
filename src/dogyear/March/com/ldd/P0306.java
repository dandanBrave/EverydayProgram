package dogyear.March.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/3/6.
 */
public class P0306 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String a = sc.next();
            String b = sc.next();
            System.out.println(rev(String.valueOf(rev(a)+rev(b))));
        }
    }

    private static int rev(String x) {
        String y = new StringBuffer(x).reverse().toString();
        return Integer.parseInt(y);
    }
}
