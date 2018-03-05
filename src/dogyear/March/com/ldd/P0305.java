package dogyear.March.com.ldd;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/3/5.
 */
public class P0305 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        while (b <= n){
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println((b-n)>(n-a)?n-a:b-n);
    }
}
